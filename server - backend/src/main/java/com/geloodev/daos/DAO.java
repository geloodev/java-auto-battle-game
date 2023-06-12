package com.geloodev.daos;

import com.geloodev.utils.HibernateUtil;

public abstract class DAO {
    public DAO() {
        HibernateUtil.init();
    }
}
