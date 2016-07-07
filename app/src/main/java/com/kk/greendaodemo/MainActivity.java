package com.kk.greendaodemo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //id无法自增
        //1对1，1对m
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void test() throws Exception {
//        DbManager.DaoConfig config = new DbManager.DaoConfig();
//        config.setDbName("user.db");
//        config.setDbVersion(1);
//        DbManager dbManager = x.getDb(config);
//
//        List<User> oldUsers = dbManager.findAll(User.class);
//        if (oldUsers == null || oldUsers.size() == 0) {
//            //插入
//            List<User> users = getDefaultUsers();
//            //greendao有事务插入？
//            if (users != null) {
//                for (User user : users) {
//                    Log.d("greendao", "add user=" + user);
//                    dbManager.saveOrUpdate(user);
//                }
//            }
//            oldUsers = dbManager.findAll(User.class);
//        }
//        Log.i("greendao", "users=" + oldUsers);
    }
//
//    private List<User> getDefaultUsers() {
//        List<User> users = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            User user = new User("name" + i, "pwd" + i);
//            if(i%2==0){
//                user.setUserType(UserType.admin);
//            }else{
//                user.setUserType(UserType.normal);
//            }
//            Goods goods = new Goods(i, i / 2, "goods" + i);
//            user.setGoods(goods);
//            users.add(user);
//        }
//        return users;
//    }
}
