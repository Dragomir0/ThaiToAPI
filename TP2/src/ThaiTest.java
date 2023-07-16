package TP2.src;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThaiTest {

    @Test // c.e25.1
    void test_voyelleSimple1() {
        assertEquals( "\u0061\u006D", Thai.versAPI( "\u0E33" ) );
    }

    @Test // c.e26.1
    void test_voyelleSimple2() {
        assertEquals( "\u0072\u026F", Thai.versAPI( "\u0E24" ) );
    }

    @Test // c.e27.1
    void test_voyelleSimple3() {
        assertEquals( "\u006C\u026F", Thai.versAPI( "\u0E26" ) );
    }

    @Test // l.e26.1
    void test_voyelleDouble1() {
        assertEquals( "\u0072\u026F\u02D0", Thai.versAPI( "\u0E24\u0E45" ) );
    }

    @Test // l.e27.1
    void test_voyelleDouble2() {
        assertEquals( "\u006C\u026F\u02D0", Thai.versAPI( "\u0E26\u0E45" ) );
    }

    @Test // c.e1.1
    void test_1Consonne0() {
        assertEquals( "\u006B\u0061\u0294", Thai.versAPI( "\u0E01\u0E30" ) );
    }

    @Test // c.e1.2
    void test_1Consonne1() {
        assertEquals( "\u014B\u0061\u0294", Thai.versAPI( "\u0E07" ) );
    }

    @Test // c.e2.1
    void test_1Consonne2() {
        assertEquals( "\u0074\u0069", Thai.versAPI( "\u0E0F\u0E34" ) );
    }

    @Test // c.e3.1
    void test_1Consonne3() {
        assertEquals( "\u006E\u026F", Thai.versAPI( "\u0E13\u0E36" ) );
    }

    @Test // c.e4.1
    void test_1Consonne4() {
        assertEquals( "\u0074\u0075", Thai.versAPI( "\u0E15\u0E38" ) );
    }

    @Test // c.e5.1
    void test_1Consonne5() {
        assertEquals( "\u006E\u0065", Thai.versAPI( "\u0E40\u0E19\u0E30" ) );
    }

    @Test // c.e6.1
    void test_1Consonne6() {
        assertEquals( "\u0070\u025B\u0294", Thai.versAPI( "\u0E41\u0E1B\u0E30" ) );
    }

    @Test // c.e7.1
    void test_1Consonne7() {
        assertEquals( "\u006D\u006F\u0294", Thai.versAPI( "\u0E42\u0E21\u0E30" ) );
    }

    @Test // c.e8.1
    void test_1Consonne8() {
        assertEquals( "\u006B\u0254\u0294", Thai.versAPI( "\u0E40\u0E01\u0E32\u0E30" ) );
    }

    @Test // c.e9.1
    void test_1Consonne9() {
        assertEquals( "\u014B\u0264\u0294", Thai.versAPI( "\u0E40\u0E07\u0E2D\u0E30" ) );
    }

    @Test // c.e10.1
    void test_1Consonne10() {
        assertEquals( "\u0074\u0069\u0061\u0294", Thai.versAPI( "\u0E40\u0E0F\u0E35\u0E22\u0E30" ) );
    }

    @Test // c.e11.1
    void test_1Consonne11() {
        assertEquals( "\u006E\u026F\u0061\u0294", Thai.versAPI( "\u0E40\u0E13\u0E37\u0E2D\u0E30" ) );
    }

    @Test // c.e12.1
    void test_1Consonne12() {
        assertEquals( "\u0074\u0075\u0061\u0294", Thai.versAPI( "\u0E15\u0E31\u0E27\u0E30" ) );
    }

    @Test // c.e13.1
    void test_1Consonne13() {
        assertEquals( "\u006E\u0069\u0077", Thai.versAPI( "\u0E19\u0E34\u0E27" ) );
    }

    @Test // c.e14.1
    void test_1Consonne14() {
        assertEquals( "\u0070\u0065\u0077", Thai.versAPI( "\u0E40\u0E1B\u0E47\u0E27" ) );
    }

    @Test // c.e16.1
    void test_1Consonne15() {
        assertEquals( "\u006D\u0061\u0077", Thai.versAPI( "\u0E40\u0E21\u0E32" ) );
    }

    @Test // c.e18.1
    void test_1Consonne16() {
        assertEquals( "\u006B\u0061\u006A", Thai.versAPI( "\u0E01\u0E31\u0E22" ) );
    }

    @Test // c.e18.2
    void test_1Consonne17() {
        assertEquals( "\u014B\u0061\u006A", Thai.versAPI( "\u0E43\u0E07" ) );
    }

    @Test // c.e18.3
    void test_1Consonne18() {
        assertEquals( "\u0074\u0061\u006A", Thai.versAPI( "\u0E44\u0E0F" ) );
    }

    @Test // c.e18.4
    void test_1Consonne19() {
        assertEquals( "\u006E\u0061\u006A", Thai.versAPI( "\u0E44\u0E13\u0E22" ) );
    }

    @Test // c.e19.1
    void test_1Consonne20() {
        assertEquals( "\u0074\u0254\u006A", Thai.versAPI( "\u0E15\u0E47\u0E2D\u0E22" ) );
    }

    @Test // c.e21.1
    void test_1Consonne21() {
        assertEquals( "\u006E\u0075\u006A", Thai.versAPI( "\u0E19\u0E38\u0E22" ) );
    }

    @Test // l.e1.1
    void test_1Consonne22() {
        assertEquals( "\u0070\u0061\u02D0", Thai.versAPI( "\u0E1B\u0E32" ) );
    }

    @Test // l.e2.1
    void test_1Consonne23() {
        assertEquals( "\u006D\u0069\u02D0", Thai.versAPI( "\u0E21\u0E35" ) );
    }

    @Test // l.e3.1
    void test_1Consonne24() {
        assertEquals( "\u006B\u026F\u02D0", Thai.versAPI( "\u0E01\u0E37\u0E2D" ) );
    }

    @Test // l.e4.1
    void test_1Consonne25() {
        assertEquals( "\u014B\u0075\u02D0", Thai.versAPI( "\u0E07\u0E39" ) );
    }

    @Test // l.e5.1
    void test_1Consonne26() {
        assertEquals( "\u0074\u0065\u02D0", Thai.versAPI( "\u0E40\u0E0F" ) );
    }

    @Test // l.e6.1
    void test_1Consonne27() {
        assertEquals( "\u006E\u025B\u02D0", Thai.versAPI( "\u0E41\u0E13" ) );
    }

    @Test // l.e7.1
    void test_1Consonne28() {
        assertEquals( "\u0074\u006F\u02D0", Thai.versAPI( "\u0E42\u0E15" ) );
    }

    @Test // l.e8.1
    void test_1Consonne29() {
        assertEquals( "\u006E\u0254\u02D0", Thai.versAPI( "\u0E19\u0E2D" ) );
    }

    @Test // l.e8.3
    void test_1Consonne30() {
        assertEquals( "\u0070\u0254\u02D0", Thai.versAPI( "\u0E1B\u0E23" ) );
    }

    @Test // l.e9.1
    void test_1Consonne31() {
        assertEquals( "\u006D\u0264\u02D0", Thai.versAPI( "\u0E40\u0E21\u0E2D" ) );
    }

    @Test // l.e10.1
    void test_1Consonne32() {
        assertEquals( "\u006B\u0069\u0061", Thai.versAPI( "\u0E40\u0E01\u0E35\u0E22" ) );
    }

    @Test // l.e11.1
    void test_1Consonne33() {
        assertEquals( "\u014B\u026F\u0061", Thai.versAPI( "\u0E40\u0E07\u0E37\u0E2D" ) );
    }

    @Test // l.e12.1
    void test_1Consonne34() {
        assertEquals( "\u0074\u0075\u0061", Thai.versAPI( "\u0E0F\u0E31\u0E27" ) );
    }

    @Test // l.e14.1
    void test_1Consonne35() {
        assertEquals( "\u006E\u0065\u02D0\u0077", Thai.versAPI( "\u0E40\u0E13\u0E27" ) );
    }

    @Test // l.e15.1
    void test_1Consonne36() {
        assertEquals( "\u0074\u025B\u02D0\u0077", Thai.versAPI( "\u0E41\u0E15\u0E27" ) );
    }

    @Test // l.e16.1
    void test_1Consonne37() {
        assertEquals( "\u006E\u0061\u02D0\u0077", Thai.versAPI( "\u0E19\u0E32\u0E27" ) );
    }

    @Test // l.e17.1
    void test_1Consonne38() {
        assertEquals( "\u0070\u0069\u0061\u0077", Thai.versAPI( "\u0E40\u0E1B\u0E35\u0E22\u0E27" ) );
    }

    @Test // l.e18.1
    void test_1Consonne39() {
        assertEquals( "\u006D\u0061\u02D0\u006A", Thai.versAPI( "\u0E21\u0E32\u0E22" ) );
    }

    @Test // l.e19.1
    void test_1Consonne40() {
        assertEquals( "\u006B\u0254\u02D0\u006A", Thai.versAPI( "\u0E01\u0E2D\u0E22" ) );
    }

    @Test // l.e20.1
    void test_1Consonne41() {
        assertEquals( "\u014B\u006F\u02D0\u006A", Thai.versAPI( "\u0E42\u0E07\u0E22" ) );
    }

    @Test // l.e22.1
    void test_1Consonne42() {
        assertEquals( "\u0074\u0264\u02D0\u006A", Thai.versAPI( "\u0E40\u0E0F\u0E22" ) );
    }

    @Test // l.e23.1
    void test_1Consonne43() {
        assertEquals( "\u006E\u0075\u0061\u006A", Thai.versAPI( "\u0E13\u0E27\u0E22" ) );
    }

    @Test // l.e24.1
    void test_1Consonne44() {
        assertEquals( "\u0074\u026F\u0061\u006A", Thai.versAPI( "\u0E40\u0E15\u0E37\u0E2D\u0E22" ) );
    }

    @Test // c.e1.3
    void test_2Consonne0() {
        assertEquals( "\u006B\u0061\u0294\u006B", Thai.versAPI( "\u0E01\u0E31\u0E01" ) );
    }

    @Test // c.e2.2
    void test_2Consonne1() {
        assertEquals( "\u014B\u0069\u014B", Thai.versAPI( "\u0E07\u0E34\u0E07" ) );
    }

    @Test // c.e3.2
    void test_2Consonne2() {
        assertEquals( "\u0074\u026F\u0074", Thai.versAPI( "\u0E0F\u0E36\u0E0F" ) );
    }

    @Test // c.e4.2
    void test_2Consonne3() {
        assertEquals( "\u006E\u0075\u006E", Thai.versAPI( "\u0E13\u0E38\u0E13" ) );
    }

    @Test // c.e5.2
    void test_2Consonne4() {
        assertEquals( "\u0074\u0065\u0074", Thai.versAPI( "\u0E40\u0E15\u0E47\u0E15" ) );
    }

    @Test // c.e6.2
    void test_2Consonne5() {
        assertEquals( "\u006E\u025B\u0294\u006E", Thai.versAPI( "\u0E41\u0E19\u0E47\u0E19" ) );
    }

    @Test // c.e7.2
    void test_2Consonne6() {
        assertEquals( "\u0070\u006F\u0294\u0070", Thai.versAPI( "\u0E1B\u0E1B" ) );
    }

    @Test // c.e8.2
    void test_2Consonne7() {
        assertEquals( "\u006D\u0254\u0294\u006D", Thai.versAPI( "\u0E21\u0E47\u0E2D\u0E21" ) );
    }

    @Test // l.e1.2
    void test_2Consonne8() {
        assertEquals( "\u006B\u0061\u02D0\u014B", Thai.versAPI( "\u0E01\u0E32\u0E07" ) );
    }

    @Test // l.e2.2
    void test_2Consonne9() {
        assertEquals( "\u014B\u0069\u02D0\u0074", Thai.versAPI( "\u0E07\u0E35\u0E0F" ) );
    }

    @Test // l.e3.2
    void test_2Consonne10() {
        assertEquals( "\u0074\u026F\u02D0\u006E", Thai.versAPI( "\u0E0F\u0E37\u0E13" ) );
    }

    @Test // l.e4.2
    void test_2Consonne11() {
        assertEquals( "\u006E\u0075\u02D0\u0074", Thai.versAPI( "\u0E13\u0E39\u0E15" ) );
    }

    @Test // l.e5.2
    void test_2Consonne12() {
        assertEquals( "\u0074\u0065\u02D0\u006E", Thai.versAPI( "\u0E40\u0E15\u0E19" ) );
    }

    @Test // l.e6.2
    void test_2Consonne13() {
        assertEquals( "\u006E\u025B\u02D0\u0070", Thai.versAPI( "\u0E41\u0E19\u0E1B" ) );
    }

    @Test // l.e7.2
    void test_2Consonne14() {
        assertEquals( "\u0070\u006F\u02D0\u006D", Thai.versAPI( "\u0E42\u0E1B\u0E21" ) );
    }

    @Test // l.e8.2
    void test_2Consonne15() {
        assertEquals( "\u006D\u0254\u02D0\u006B", Thai.versAPI( "\u0E21\u0E2D\u0E01" ) );
    }

    @Test // l.e9.2
    void test_2Consonne16() {
        assertEquals( "\u006B\u0264\u02D0\u014B", Thai.versAPI( "\u0E40\u0E01\u0E34\u0E07" ) );
    }

    @Test // l.e9.3
    void test_2Consonne17() {
        assertEquals( "\u014B\u0264\u02D0\u0074", Thai.versAPI( "\u0E40\u0E07\u0E2D\u0E0F" ) );
    }

    @Test // l.e10.2
    void test_2Consonne18() {
        assertEquals( "\u0074\u0069\u0061\u006E", Thai.versAPI( "\u0E40\u0E0F\u0E35\u0E22\u0E13" ) );
    }

    @Test // l.e11.2
    void test_2Consonne19() {
        assertEquals( "\u006E\u026F\u0061\u0074", Thai.versAPI( "\u0E40\u0E13\u0E37\u0E2D\u0E15" ) );
    }

    @Test // l.e12.2
    void test_2Consonne20() {
        assertEquals( "\u0074\u0075\u0061\u006E", Thai.versAPI( "\u0E15\u0E27\u0E19" ) );
    }

    @Test
    void test_CiCf1() {
        assertEquals( "\u006B\u02B0\u006F\u0294\u006E", Thai.versAPI( "\u0E03\u0E2C" ) );
    }

    @Test
    void test_CiCf2() {
        assertEquals( "\u006B\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E03\u0E2A" ) );
    }

    @Test
    void test_CiCf3() {
        assertEquals( "\u006B\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E04\u0E29" ) );
    }

    @Test
    void test_CiCf4() {
        assertEquals( "\u006B\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E05\u0E28" ) );
    }

    @Test
    void test_CiCf5() {
        assertEquals( "\u006B\u02B0\u006F\u0294\u0077", Thai.versAPI( "\u0E06\u0E27" ) );
    }

    @Test
    void test_CiCf6() {
        assertEquals( "\u0074\u0255\u006F\u0294\u006E", Thai.versAPI( "\u0E08\u0E25" ) );
    }

    @Test
    void test_CiCf7() {
        assertEquals( "\u0073\u006F\u0294\u006A", Thai.versAPI( "\u0E0B\u0E22" ) );
    }

    @Test
    void test_CiCf8() {
        assertEquals( "\u0074\u0255\u02B0\u006F\u0294\u0070", Thai.versAPI( "\u0E0A\u0E20" ) );
    }

    @Test
    void test_CiCf9() {
        assertEquals( "\u006A\u006F\u0294\u0070", Thai.versAPI( "\u0E0D\u0E1E" ) );
    }

    @Test
    void test_CiCf10() {
        assertEquals( "\u0064\u006F\u0294\u0070", Thai.versAPI( "\u0E0E\u0E1F" ) );
    }

    @Test
    void test_CiCf11() {
        assertEquals( "\u0074\u02B0\u006F\u0294\u0070", Thai.versAPI( "\u0E10\u0E1A" ) );
    }

    @Test
    void test_CiCf12() {
        assertEquals( "\u0074\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E11\u0E18" ) );
    }

    @Test
    void test_CiCf13() {
        assertEquals( "\u0074\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E12\u0E17" ) );
    }

    @Test
    void test_CiCf14() {
        assertEquals( "\u0064\u006F\u0294\u0074", Thai.versAPI( "\u0E14\u0E16" ) );
    }

    @Test
    void test_CiCf15() {
        assertEquals( "\u0074\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E16\u0E14" ) );
    }

    @Test
    void test_CiCf16() {
        assertEquals( "\u0074\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E17\u0E12" ) );
    }

    @Test
    void test_CiCf17() {
        assertEquals( "\u0074\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E18\u0E11" ) );
    }

    @Test
    void test_CiCf18() {
        assertEquals( "\u0062\u006F\u0294\u0074", Thai.versAPI( "\u0E1A\u0E10" ) );
    }

    @Test
    void test_CiCf19() {
        assertEquals( "\u0070\u02B0\u006F\u0294\u0074", Thai.versAPI( "\u0E1E\u0E0E" ) );
    }

    @Test
    void test_CiCf20() {
        assertEquals( "\u0070\u02B0\u006F\u0294\u006E", Thai.versAPI( "\u0E20\u0E0D" ) );
    }

    @Test
    void test_CiCf21() {
        assertEquals( "\u006A\u006F\u0294\u0074", Thai.versAPI( "\u0E22\u0E0A" ) );
    }

    @Test
    void test_CiCf22() {
        assertEquals( "\u0072\u006F\u0294\u0074", Thai.versAPI( "\u0E23\u0E08" ) );
    }

    @Test
    void test_CiCf23() {
        assertEquals( "\u006C\u006F\u0294\u006B", Thai.versAPI( "\u0E25\u0E06" ) );
    }

    @Test
    void test_CiCf24() {
        assertEquals( "\u0077\u006F\u0294\u006B", Thai.versAPI( "\u0E27\u0E05" ) );
    }

    @Test
    void test_CiCf25() {
        assertEquals( "\u0073\u006F\u0294\u006B", Thai.versAPI( "\u0E28\u0E04" ) );
    }

    @Test
    void test_CiCf26() {
        assertEquals( "\u0073\u006F\u0294\u006B", Thai.versAPI( "\u0E29\u0E03" ) );
    }

    @Test
    void test_CiCf27() {
        assertEquals( "\u006C\u0061\u0294\u006E", Thai.versAPI( "\u0E2C\u0E31\u0E23" ) );
    }

    @Test
    void test_Ci1() {
        assertEquals( "\u0068\u0061\u0294", Thai.versAPI( "\u0E2E" ) );
    }

    @Test
    void test_Ci2() {
        assertEquals( "\u0068\u0061\u0294", Thai.versAPI( "\u0E2B" ) );
    }

    @Test
    void test_Ci3() {
        assertEquals( "\u0066\u0061\u0294", Thai.versAPI( "\u0E1D" ) );
    }

    @Test
    void test_Ci4() {
        assertEquals( "\u0294\u0061\u0294", Thai.versAPI( "\u0E2D" ) );
    }

    @Test
    void test_Ci5() {
        assertEquals( "\u0070\u02B0\u0061\u0294", Thai.versAPI( "\u0E1C" ) );
    }

    @Test
    void test_Ci6() {
        assertEquals( "\u0074\u0255\u02B0\u0061\u0294", Thai.versAPI( "\u0E09" ) );
    }

    @Test
    void test_Ci7() {
        assertEquals( "\u0074\u0255\u02B0\u0061\u0294", Thai.versAPI( "\u0E0C" ) );
    }

    @Test
    void test_exception1() {
        assertThrows( NoSuchElementException.class, () -> Thai.versAPI( "u0E0C" ) );
    }

    @Test
    void test_exception2() {
        assertThrows( NoSuchElementException.class, () -> Thai.versAPI( "\\u0E0C" ) );
    }

    @Test
    void test_exception3() {
        assertThrows( NoSuchElementException.class, () -> Thai.versAPI( "0x0E0C" ) );
    }

    @Test
    void test_exception4() {
        assertThrows( NoSuchElementException.class, () -> Thai.versAPI( "allo" ) );
    }

    @Test
    void test_exception5() {
        assertThrows( NoSuchElementException.class, () -> Thai.versAPI( "\u0E33\u0E01" ) );
    }

    @Test
    void test_exception6() {
        assertThrows( NoSuchElementException.class, () -> Thai.versAPI( "\u0E01\u0E02\u0E03" ) );
    }

    @Test
    void test_exception7() {
        assertThrows( NoSuchElementException.class, () -> Thai.versAPI( "\u0E24\u0E26" ) );
    }

    @Test
    void test_exception8() {
        assertThrows( NoSuchElementException.class, () -> Thai.versAPI( "\u0E30\u0E02" ) );
    }

    @Test
    void test_syllabe1() {
        assertEquals( "", Thai.versAPI( "" ) );
    }

    @Test
    void test_syllabe2() {
        assertEquals( "\u006B\u0254\u0294 \u006E\u0075\u0061\u006A", Thai.versAPI( "\u0E40\u0E01\u0E32\u0E30 \u0E13\u0E27\u0E22" ) );
    }

    @Test
    void test_syllabe3() {
        int NB_CAS = 4;
        String entrees = Stream.generate( () -> "\u0E33" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );
        String sorties = Stream.generate( () -> "\u0061\u006D" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );

        assertEquals( sorties, Thai.versAPI( entrees ) );
    }

    @Test
    void test_syllabe4() {
        int NB_CAS = 10;
        String entrees = Stream.generate( () -> "\u0E33" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );
        String sorties = Stream.generate( () -> "\u0061\u006D" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );

        assertEquals( sorties, Thai.versAPI( entrees ) );
    }

    @Test
    void test_syllabe5() {
        int NB_CAS = 100;
        String entrees = Stream.generate( () -> "\u0E33" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );
        String sorties = Stream.generate( () -> "\u0061\u006D" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );

        assertEquals( sorties, Thai.versAPI( entrees ) );
    }

    @Test
    void test_syllabe6() {
        int NB_CAS = 1_000;
        String entrees = Stream.generate( () -> "\u0E33" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );
        String sorties = Stream.generate( () -> "\u0061\u006D" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );

        assertEquals( sorties, Thai.versAPI( entrees ) );
    }

    @Test
    void test_syllabe7() {
        int NB_CAS = 10_000;
        String entrees = Stream.generate( () -> "\u0E40\u0E2E\u0E2D\u0E30" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );
        String sorties = Stream.generate( () -> "\u0068\u0264\u0294" ).limit( NB_CAS ).collect( Collectors.joining( " " ) );

        assertEquals( sorties, Thai.versAPI( entrees ) );
    }
}