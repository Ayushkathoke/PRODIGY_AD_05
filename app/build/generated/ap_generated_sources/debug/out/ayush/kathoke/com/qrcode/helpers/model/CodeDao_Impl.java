package ayush.kathoke.com.qrcode.helpers.model;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public final class CodeDao_Impl implements CodeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCode;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCode;

  public CodeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCode = new EntityInsertionAdapter<Code>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CODES`(`id`,`mContent`,`mType`,`mCodeImagePath`,`mTimeStamp`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Code value) {
        stmt.bindLong(1, value.mId);
        if (value.getContent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContent());
        }
        stmt.bindLong(3, value.getType());
        if (value.getCodeImagePath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCodeImagePath());
        }
        stmt.bindLong(5, value.getTimeStamp());
      }
    };
    this.__deletionAdapterOfCode = new EntityDeletionOrUpdateAdapter<Code>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CODES` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Code value) {
        stmt.bindLong(1, value.mId);
      }
    };
  }

  @Override
  public Completable insert(final Code entity) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCode.insert(entity);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public int delete(final Code entity) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfCode.handle(entity);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flowable<List<Code>> getAllFlowableCodes() {
    final String _sql = "SELECT * FROM CODES";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, new String[]{"CODES"}, new Callable<List<Code>>() {
      @Override
      public List<Code> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfMContent = CursorUtil.getColumnIndexOrThrow(_cursor, "mContent");
          final int _cursorIndexOfMType = CursorUtil.getColumnIndexOrThrow(_cursor, "mType");
          final int _cursorIndexOfMCodeImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "mCodeImagePath");
          final int _cursorIndexOfMTimeStamp = CursorUtil.getColumnIndexOrThrow(_cursor, "mTimeStamp");
          final List<Code> _result = new ArrayList<Code>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Code _item;
            _item = new Code();
            _item.mId = _cursor.getLong(_cursorIndexOfMId);
            final String _tmpMContent;
            _tmpMContent = _cursor.getString(_cursorIndexOfMContent);
            _item.setContent(_tmpMContent);
            final int _tmpMType;
            _tmpMType = _cursor.getInt(_cursorIndexOfMType);
            _item.setType(_tmpMType);
            final String _tmpMCodeImagePath;
            _tmpMCodeImagePath = _cursor.getString(_cursorIndexOfMCodeImagePath);
            _item.setCodeImagePath(_tmpMCodeImagePath);
            final long _tmpMTimeStamp;
            _tmpMTimeStamp = _cursor.getLong(_cursorIndexOfMTimeStamp);
            _item.setTimeStamp(_tmpMTimeStamp);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
