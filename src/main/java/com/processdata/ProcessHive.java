// Copyright 2018 Mobvoi Inc. All Rights Reserved.

package com.processdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * created by zhhgao@mobvoi.com on 18-7-23
 */
@Component
public class ProcessHive {
  private static final Logger logger = LoggerFactory.getLogger(ProcessHive.class);
  @Autowired
  @Qualifier("hiveJdbcTemplate")
  private JdbcTemplate hiveJdbcTemplate;
  @Bean
  public String ProcessHiveBySpark(){
//    hiveJdbcTemplate.execute("use mobvoi;");

    logger.info("ProcessHiveBySpark .......done");
    return "";
  }
}