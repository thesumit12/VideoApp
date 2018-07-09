package com.example.video.videoapp.data.db.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "IMAGES".
*/
public class ImagesDao extends AbstractDao<Images, Long> {

    public static final String TABLENAME = "IMAGES";

    /**
     * Properties of entity Images.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TypeBanner = new Property(1, String.class, "typeBanner", false, "typeBanner");
        public final static Property TypePortrait = new Property(2, String.class, "typePortrait", false, "typePortrait");
    }


    public ImagesDao(DaoConfig config) {
        super(config);
    }
    
    public ImagesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"IMAGES\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"typeBanner\" TEXT," + // 1: typeBanner
                "\"typePortrait\" TEXT);"); // 2: typePortrait
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"IMAGES\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Images entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String typeBanner = entity.getTypeBanner();
        if (typeBanner != null) {
            stmt.bindString(2, typeBanner);
        }
 
        String typePortrait = entity.getTypePortrait();
        if (typePortrait != null) {
            stmt.bindString(3, typePortrait);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Images entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String typeBanner = entity.getTypeBanner();
        if (typeBanner != null) {
            stmt.bindString(2, typeBanner);
        }
 
        String typePortrait = entity.getTypePortrait();
        if (typePortrait != null) {
            stmt.bindString(3, typePortrait);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Images readEntity(Cursor cursor, int offset) {
        Images entity = new Images( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // typeBanner
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // typePortrait
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Images entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTypeBanner(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTypePortrait(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Images entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Images entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Images entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}