package com.septinary.xb.core.utils;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class IdUtil
{
  public static String getId()
  {
    TimeZone tz = TimeZone.getTimeZone("ETC/GMT-8");

    TimeZone.setDefault(tz);

    SimpleDateFormat format = new SimpleDateFormat("HHmmssSS");

    return getMyRandom() + getMyRandom() + getMyRandom() + getMyRandom() + 
      format.format(new Date());
  }

  public static int getMyRandom() {
    int myRandom = 1;
    int temp;
    do {
      temp = (int)(Math.random() * 1000.0D);
    }
    while ((temp <= 0) && (temp > 9));

    myRandom = temp;

    return myRandom;
  }
}