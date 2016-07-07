package com.kk.greendaodemo;

import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Property;
import org.greenrobot.greendao.generator.Schema;
import org.junit.Test;

import java.io.File;

public class GreenDaoGenerator {
    @Test
    public void gen() throws Exception {
        // 正如你所见的，你创建了一个用于添加实体（Entity）的模式（Schema）对象。
        // 两个参数分别代表：数据库版本号与自动生成代码的包路径。
        Schema schema = new Schema(1, "com.kk.greendao.bean");
        schema.setDefaultJavaPackageDao("com.kk.greendao.db");
        File dir = new File("src/main/java-gen");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        System.out.println(dir.getAbsoluteFile());
        //表
        Entity user = schema.addEntity("User");
        user.addLongProperty("id").primaryKey().autoincrement();
        user.addStringProperty("name").notNull();
        user.addStringProperty("sex").columnName("sex");
        //Picture
        Entity picture =  schema.addEntity("Picture");
        picture.addLongProperty("pictureId").primaryKey();
        picture.addStringProperty("pictureName").notNull();
        picture.addIntProperty("width");
        picture.addIntProperty("height");
        //建立一对一关联
        Property property =  user.addLongProperty("pictureId").getProperty();
        user.addToOne(picture,property);

        Property propertyName = picture.addLongProperty("userId").getProperty();
        picture.addToOne(user,propertyName);
        new DaoGenerator().generateAll(schema, dir.getAbsolutePath());
    }
}
