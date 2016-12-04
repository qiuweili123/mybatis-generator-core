package com.mybatis.generator.bootstrap;

import org.mybatis.generator.api.ShellRunner;

/**
 * ClassName: MybatisGenerator <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2016年12月4日 上午12:22:17 <br/>
 * Mybatis Bean\Mapper\Mapping\Service生成
 *
 * @author zhaolei
 * @version
 */
public class MybatisGenerator {
  public static void main(String[] args) throws Exception {
    MybatisGenerator generator = new MybatisGenerator();
    String rootPath = generator.getClass().getResource("/").getFile().toString();
    String[] arg = new String[] {"-configfile", rootPath + "mysql/generatorConfig-mysql-sport.xml", "-overwrite"};
    ShellRunner.main(arg);
  }
}
