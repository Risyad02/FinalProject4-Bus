package com.tinne.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    private TextView textAmount;
    private EditText editCardNumber;
    private Button buttonPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        textAmount = findViewById(R.id.text_amount);
        editCardNumber = findViewById(R.id.edit_card_number);
        buttonPay = findViewById(R.id.button_pay);

        // Get the amount from the previous activity
        double amount = getIntent().getDoubleExtra("amount", 0.0);
        textAmount.setText("Total Amount: $" + amount);

        buttonPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Process the payment
                String cardNumber = editCardNumber.getText().toString();
                processPayment(amount, cardNumber);
            }
    });
}

    private void processPayment(double amount, String cardNumber) {
        String message = "Payment processed successfully! Amount: $" + amount + ", Card Number: " + cardNumber;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    }