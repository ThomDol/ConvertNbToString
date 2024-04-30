package fr.td;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        assertEquals("0", StringUtil.fizzBuzz(0));
        assertEquals("1", StringUtil.fizzBuzz(1));
        assertEquals("2", StringUtil.fizzBuzz(2));
        assertEquals("fizz", StringUtil.fizzBuzz(3));
        assertEquals("4", StringUtil.fizzBuzz(4));
        assertEquals("buzz", StringUtil.fizzBuzz(5));
        assertEquals("fizz", StringUtil.fizzBuzz(6));
        assertEquals("7", StringUtil.fizzBuzz(7));
        assertEquals("8", StringUtil.fizzBuzz(8));
        assertEquals("fizz", StringUtil.fizzBuzz(9));
        assertEquals("buzz", StringUtil.fizzBuzz(10));
        assertEquals("11", StringUtil.fizzBuzz(11));
        assertEquals("fizz", StringUtil.fizzBuzz(12));
        assertEquals("14", StringUtil.fizzBuzz(14));
        assertEquals("fizzBuzz", StringUtil.fizzBuzz(15));

    }

    @org.junit.jupiter.api.Test
    void toLiteral() {
        assertEquals("zéro", StringUtil.toLiteral(0));
        assertEquals("un", StringUtil.toLiteral(1));
        assertEquals("neuf", StringUtil.toLiteral(9));
        assertEquals("dix", StringUtil.toLiteral(10));
        assertEquals("onze", StringUtil.toLiteral(11));
        assertEquals("douze", StringUtil.toLiteral(12));
        assertEquals("treize", StringUtil.toLiteral(13));
        assertEquals("quatorze", StringUtil.toLiteral(14));
        assertEquals("dix sept", StringUtil.toLiteral(17));
        assertEquals("dix huit", StringUtil.toLiteral(18));
        assertEquals("dix neuf", StringUtil.toLiteral(19));
        assertEquals("vingt", StringUtil.toLiteral(20));
        assertEquals("vingt et un", StringUtil.toLiteral(21));
        assertEquals("vingt deux", StringUtil.toLiteral(22));
        assertEquals("trente", StringUtil.toLiteral(30));
        assertEquals("trente et un", StringUtil.toLiteral(31));
        assertEquals("trente deux", StringUtil.toLiteral(32));
        assertEquals("quarante", StringUtil.toLiteral(40));
        assertEquals("cinquante", StringUtil.toLiteral(50));
        assertEquals("soixante", StringUtil.toLiteral(60));
        assertEquals("soixante et un", StringUtil.toLiteral(61));
        assertEquals("soixante deux", StringUtil.toLiteral(62));
        assertEquals("soixante dix", StringUtil.toLiteral(70));
        assertEquals("soixante et onze", StringUtil.toLiteral(71));
        assertEquals("soixante douze", StringUtil.toLiteral(72));
        assertEquals("soixante dix neuf", StringUtil.toLiteral(79));
        assertEquals("quatre vingts", StringUtil.toLiteral(80));
        assertEquals("quatre vingt deux", StringUtil.toLiteral(82));
        assertEquals("quatre vingt dix", StringUtil.toLiteral(90));
        assertEquals("quatre vingt onze", StringUtil.toLiteral(91));
        assertEquals("quatre vingt seize", StringUtil.toLiteral(96));
        assertEquals("quatre vingt dix sept", StringUtil.toLiteral(97));
        assertEquals("quatre vingt dix neuf", StringUtil.toLiteral(99));
        assertEquals("cent", StringUtil.toLiteral(100));
        assertEquals("cent cinquante trois", StringUtil.toLiteral(153));
        assertEquals("cent quatre vingts", StringUtil.toLiteral(180));
        assertEquals("cent quatre vingt quatre", StringUtil.toLiteral(184));
        assertEquals("trois cent quatre vingts", StringUtil.toLiteral(380));
        assertEquals("sept cents", StringUtil.toLiteral(700));
        assertEquals("sept cent soixante dix neuf", StringUtil.toLiteral(779));
        assertEquals("neuf cent quatre vingt dix neuf",StringUtil.toLiteral(999));
        assertEquals("deux millions deux cent mille huit cent quarante cinq",StringUtil.toLiteral(2200845));
        assertEquals("mille cinq cents",StringUtil.toLiteral(1500));
        assertEquals("huit mille six cent vingt",StringUtil.toLiteral(8620));
        assertEquals("douze mille huit cent quarante cinq",StringUtil.toLiteral(12845));
        assertEquals("deux millions deux cent mille huit cent quarante cinq",StringUtil.toLiteral(2200845));
        assertEquals("trois cent quarante cinq mille six cent cinquante huit",StringUtil.toLiteral(345658));
        assertEquals("un million six cent mille",StringUtil.toLiteral(1600000));
        assertEquals("trois millions cinq cent soixante cinq mille huit cent quarante cinq",StringUtil.toLiteral(3565845));
        assertEquals("deux cent mille",StringUtil.toLiteral(200000));
        assertEquals("deux cent millions",StringUtil.toLiteral(200000000));






    }

}