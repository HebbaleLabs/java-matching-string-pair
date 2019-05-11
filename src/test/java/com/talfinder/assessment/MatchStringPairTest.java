package com.talfinder.assessment;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Created by shashidhara on 5/10/19.
 */
@RunWith(Parameterized.class)
public class MatchStringPairTest {

  @Parameters
  public static Collection<Object[]> parameters() {
    return Arrays.asList(new Object[][] {
        {new String[] {"A"}, "A", false},
        {new String[] {"", null}, null, false},
        {new String[] {"A", "B"}, "AB", true},
        {new String[] {"C", "D"}, "DC", true},
        {new String[] {"E", "F"}, "GH", false},
        {new String[] {"H", "H"}, "", false},
        {new String[] {"B", "C", "A", "D"}, "DB", true},
        {new String[] {"A", "A", "C", "AC"}, "AAC", true},
        {new String[] {"C", "D", "DC", "AC"}, "ACDC", true},
        {new String[] {"ZP","BD","ID","QM","AP","FY","HF","ER","ZE","LA","EB","TB","UL","YX","PM","KH","AY","VK","NV","AX"}, "ZEER", true},
        {new String[] {"FQI","ZSR","YRU","SJZ","NOY","NCE","CEJ","GFN","ILC","DLX","BMS","YZS","CCG","LMJ","KNZ","LPL","OIB",
            "ASS","CKT","VQY","FJC","VRZ","WGY","BRY","UVE","KTR","GRL","PZC","WIE","CDM","AHT","NXQ","YSS","SRL","WVR","BDB",
            "HOK","EHY","JBO","UCW","QKU","CQD","OGQ","BTH","CJI","JQX","XWX","MCB","NWP","CZI"}, "CJIVRZ", true},
        {new String[] {"9DP","MVQ","A9T","CRZ","CI8","QT1","D0F","SSX","PRK","LKH","YCW","VNU","D6F","JMX","ACT","15E","4QQ",
            "QK3","R6E","1A7","46X","M1M","KNJ","R3B","WAS","AN9","2QN","7M7","GMU","5R8","FKG","KAG","XZR","9BN","KMS","1ZB",
            "WXC","KH1","SIV","RLT","SDX","LGW","DU5","LDT","GQ7","JMM","CZN","GCU","HYT","0UF","Q48","XDG","WOI","USX","VOU",
            "08W","QGJ","NDS","67U","9YU","1KO","Z58","JYM","JWX","A45","OV4","8VG","UHV","1AX","WBQ","GAV","QS0","Z99","MM7",
            "J4T","XZK","NHR","8K1","W8O","YC0","V57","NT7","ZMI","UKV","485","P18","HVM","PSG","EE0","M1U","TFR","XQN","ZL6",
            "T19","KDM","YBU","YC7","G0L","FYD","U1T"}, "LGW1DP", false},
        {new String[] {"A", "A", "B", "F"}, "AF", true},
        {new String[] {"P", "Q", "P", "V"}, "QO", false},
        {new String[] {"H", "R", "O", "P", "R"}, "RP", true},
        {new String[] {"A", "L", "L", "H"}, "ALLH", false},
    });
  }

  private final String[] inputStrings;
  private final String desiredString;
  private final boolean expectedResult;

  public MatchStringPairTest(String[] inputStrings, String desiredString, boolean expectedResult) {
    this.inputStrings = inputStrings;
    this.desiredString = desiredString;
    this.expectedResult = expectedResult;
  }

  @Test
  public void isConcatStringPairMatching() {
    Assert.assertEquals("input:Input values as " + Arrays.toString(inputStrings) + " and Desired String as "+ desiredString , expectedResult, MatchStringPair.isStringPairMatching(inputStrings, desiredString));
  }
}
