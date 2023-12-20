package ayush.kathoke.com.qrcode.helpers.util.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import ayush.kathoke.com.qrcode.helpers.model.CodeDao;
import ayush.kathoke.com.qrcode.helpers.model.CodeDao_Impl;

@SuppressWarnings("unchecked")
public final class QrCobaDatabase_Impl extends QrCobaDatabase {
  private volatile CodeDao _codeDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CODES` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mContent` TEXT, `mType` INTEGER NOT NULL, `mCodeImagePath` TEXT, `mTimeStamp` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"6474d2d83ff76b01ce94099ce8a80009\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `CODES`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCODES = new HashMap<String, TableInfo.Column>(5);
        _columnsCODES.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCODES.put("mContent", new TableInfo.Column("mContent", "TEXT", false, 0));
        _columnsCODES.put("mType", new TableInfo.Column("mType", "INTEGER", true, 0));
        _columnsCODES.put("mCodeImagePath", new TableInfo.Column("mCodeImagePath", "TEXT", false, 0));
        _columnsCODES.put("mTimeStamp", new TableInfo.Column("mTimeStamp", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCODES = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCODES = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCODES = new TableInfo("CODES", _columnsCODES, _foreignKeysCODES, _indicesCODES);
        final TableInfo _existingCODES = TableInfo.read(_db, "CODES");
        if (! _infoCODES.equals(_existingCODES)) {
          throw new IllegalStateException("Migration didn't properly handle CODES(wasakey.w3apps.com.qrcode.helpers.model.Code).\n"
                  + " Expected:\n" + _infoCODES + "\n"
                  + " Found:\n" + _existingCODES);
        }
      }
    }, "6474d2d83ff76b01ce94099ce8a80009", "a580e7ee7004ebba3090a76a1eac6a2b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "CODES");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `CODES`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CodeDao codeDao() {
    if (_codeDao != null) {
      return _codeDao;
    } else {
      synchronized(this) {
        if(_codeDao == null) {
          _codeDao = new CodeDao_Impl(this);
        }
        return _codeDao;
      }
    }
  }
}
