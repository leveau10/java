package Calculator;
public class Calculator {
    private float _value = 0;

    void setValueOne(float x){
        _value = x;
    }
    
    void sum(float y){
        _value += y;
    }

    void sub(float y){
        _value -= y;
    }

    void mul(float y){
        _value *= y; 
    }

    void div(float y){
        _value /= y;
    }

    float getValue(){
        return _value;
    }
}
