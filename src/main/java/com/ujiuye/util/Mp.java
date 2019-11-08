package com.ujiuye.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Mp {

    public static void main(String[] args) {
         //代码生成器
        AutoGenerator mpg = new AutoGenerator();
       // 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true) // 是否支持AR模式
                .setAuthor("wangjiandong") // 作者
                .setOutputDir("D:\\tangjianjun1\\weblixi\\java_third_lesson\\1031\\代码\\mybatisplus\\src\\main\\java") // 生成路径
                .setFileOverride(true) // 多次生成是否文件覆盖
                .setIdType(IdType.AUTO) // 主键策略
                .setServiceName("%sService") // 设置生成的service接口的名字的首字母是否为I
                // IEmployeeService
                .setBaseResultMap(true) // 生成mapper配置文件
                .setBaseColumnList(true); // sql 段

        // 2. 数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL) // 设置数据库类型
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/ks")
                .setUsername("root")
                .setPassword("123123");

        //3. 策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) //全局大写命名
                .setNaming(NamingStrategy.underline_to_camel) // 数据库表映射到实体的命名策略
//                .setTablePrefix("tb_")
                .setInclude("emp","dept","regist");  // 依据的表
//                .setInclude("orders");  // 依据的表


        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.ujiuye")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("bean")
                .setXml("mapper");


        AutoGenerator  ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //6. 执行
        ag.execute();








    }
}
