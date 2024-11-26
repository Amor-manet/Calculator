import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class testCalculator {

    @Test
    @DisplayName("런테스트")
    public void testRun(){
        Calculator calculator = new Calculator();
        int rs = calculator.run("3+5");


        assertThat(rs).isEqualTo(8);
    }



    @Test
    @DisplayName("덧셈테스트")
    public void testPlus(){
        Calculator calculator = new Calculator();
        int rs = calculator.plus(1,2);


        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("곱셈테스트")
    public void testMul(){
        Calculator calculator = new Calculator();
        int rs = calculator.multipl(5,6);

        assertThat(rs).isEqualTo(30);

    }

    @Test
    @DisplayName("뺄셈테스트")
    public void testSub(){
        Calculator calculator = new Calculator();
        int rs = calculator.subtraction(17,2);

        assertThat(rs).isEqualTo(15);

    }

    @Test
    @DisplayName("나누기테스트")
    public void testDiv(){
        Calculator calculator = new Calculator();
        int rs = calculator.division(18,3);

        assertThat(rs).isEqualTo(6);

    }



}
