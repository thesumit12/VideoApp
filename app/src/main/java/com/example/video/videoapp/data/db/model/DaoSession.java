package com.example.video.videoapp.data.db.model;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.video.videoapp.data.db.model.Contents;
import com.example.video.videoapp.data.db.model.Images;
import com.example.video.videoapp.data.db.model.Rails;

import com.example.video.videoapp.data.db.model.ContentsDao;
import com.example.video.videoapp.data.db.model.ImagesDao;
import com.example.video.videoapp.data.db.model.RailsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig contentsDaoConfig;
    private final DaoConfig imagesDaoConfig;
    private final DaoConfig railsDaoConfig;

    private final ContentsDao contentsDao;
    private final ImagesDao imagesDao;
    private final RailsDao railsDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        contentsDaoConfig = daoConfigMap.get(ContentsDao.class).clone();
        contentsDaoConfig.initIdentityScope(type);

        imagesDaoConfig = daoConfigMap.get(ImagesDao.class).clone();
        imagesDaoConfig.initIdentityScope(type);

        railsDaoConfig = daoConfigMap.get(RailsDao.class).clone();
        railsDaoConfig.initIdentityScope(type);

        contentsDao = new ContentsDao(contentsDaoConfig, this);
        imagesDao = new ImagesDao(imagesDaoConfig, this);
        railsDao = new RailsDao(railsDaoConfig, this);

        registerDao(Contents.class, contentsDao);
        registerDao(Images.class, imagesDao);
        registerDao(Rails.class, railsDao);
    }
    
    public void clear() {
        contentsDaoConfig.clearIdentityScope();
        imagesDaoConfig.clearIdentityScope();
        railsDaoConfig.clearIdentityScope();
    }

    public ContentsDao getContentsDao() {
        return contentsDao;
    }

    public ImagesDao getImagesDao() {
        return imagesDao;
    }

    public RailsDao getRailsDao() {
        return railsDao;
    }

}