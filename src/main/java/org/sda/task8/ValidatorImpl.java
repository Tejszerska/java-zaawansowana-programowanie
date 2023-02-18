package org.sda.task8;
 /* Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300,
         * czy każdy z rozmiarów nie jest mniejszy niż 30, czy waga nie przekracza 30.0 dla isExpress=false
         * lub 15.0 dla isExpress=true. W przypadku błędów, powinien o nich poinformować użytkownika.
         */
public class ValidatorImpl implements Validator{
    @Override
    public boolean validate(Parcel input) {
        if(input.getxLength() + input.getyLength() + input.getzLength() >=300
                || input.getxLength() < 30 || input.getyLength() <30 || input.getzLength() <30
                || (input.isExpress && input.getWeight()> 15)  || (!input.isExpress && input.getWeight() > 30)
        ){
            return false;
        } else
            return true;

}
}
