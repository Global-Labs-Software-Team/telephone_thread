package tests;

import models.Telephone;
import models.Pipeline;

public class TelephoneTest {
    public static void main(String[] args) {
        Pipeline phone1_to_phone2 = new Pipeline();
        Pipeline phone2_to_phone1 = new Pipeline();
        new Telephone("1", phone1_to_phone2, phone2_to_phone1, 30).run(); // Replace after with start because will be a thread
        new Telephone("2", phone2_to_phone1, phone1_to_phone2, 30).run(); // Replace after with start because will be a thread
    }
}
