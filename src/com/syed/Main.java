package com.syed;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        JFrame root = new JFrame("Calculator");
        root.setSize(500, 500);
        root.setVisible(true);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel main_panel = new JPanel();
        main_panel.setLayout(null);
        root.add(main_panel);

        JLabel title = new JLabel("Made by SyedAhkam");
        title.setBounds(150, 10, 150, 10);
        main_panel.add(title);

        JTextField result_field = new JTextField("Calculator is ready!");
        result_field.setBounds(150, 50, 200, 50);
        main_panel.add(result_field);

        JButton one = new JButton("1");
        one.setBounds(150, 150, 50, 50);
        main_panel.add(one);

        JButton two = new JButton("2");
        two.setBounds(200, 150, 50, 50);
        main_panel.add(two);

        JButton three = new JButton("3");
        three.setBounds(250, 150, 50, 50);
        main_panel.add(three);

        JButton plus = new JButton("+");
        plus.setBounds(300, 150, 50, 50);
        main_panel.add(plus);

        JButton four = new JButton("4");
        four.setBounds(150, 200, 50, 50);
        main_panel.add(four);

        JButton five = new JButton("5");
        five.setBounds(200, 200, 50, 50);
        main_panel.add(five);

        JButton six = new JButton("6");
        six.setBounds(250, 200, 50, 50);
        main_panel.add(six);

        JButton minus = new JButton("-");
        minus.setBounds(300, 200, 50, 50);
        main_panel.add(minus);

        JButton seven = new JButton("7");
        seven.setBounds(150, 250, 50, 50);
        main_panel.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(200, 250, 50, 50);
        main_panel.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(250, 250, 50, 50);
        main_panel.add(nine);

        JButton multiply = new JButton("x");
        multiply.setBounds(300, 250, 50, 50);
        main_panel.add(multiply);

        JButton zero = new JButton("0");
        zero.setBounds(150, 300, 50, 50);
        main_panel.add(zero);

        JButton dot = new JButton(".");
        dot.setBounds(200, 300, 50, 50);
        main_panel.add(dot);

        JButton percent = new JButton("%");
        percent.setBounds(250, 300, 50, 50);
        main_panel.add(percent);

        JButton divide = new JButton("/");
        divide.setBounds(300, 300, 50, 50);
        main_panel.add(divide);

        JButton equals = new JButton("=");
        equals.setBounds(200, 350, 50, 50);
        main_panel.add(equals);

        JButton clear = new JButton("C");
        clear.setBounds(250, 350, 50, 50);
        main_panel.add(clear);

        one.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("1");
                return;
            }
            result_field.setText(current_value + "1");
        });

        two.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("2");
                return;
            }
            result_field.setText(current_value + "2");
        });

        three.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("3");
                return;
            }
            result_field.setText(current_value + "3");
        });

        plus.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("+");
                return;
            }
            result_field.setText(current_value + "+");
        });

        four.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("4");
                return;
            }
            result_field.setText(current_value + "4");
        });

        five.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("5");
                return;
            }
            result_field.setText(current_value + "5");
        });

        six.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("6");
                return;
            }
            result_field.setText(current_value + "6");
        });

        minus.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("-");
                return;
            }
            result_field.setText(current_value + "-");
        });

        seven.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("7");
                return;
            }
            result_field.setText(current_value + "7");
        });

        eight.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("8");
                return;
            }
            result_field.setText(current_value + "8");
        });

        nine.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("9");
                return;
            }
            result_field.setText(current_value + "9");
        });

        multiply.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("*");
                return;
            }
            result_field.setText(current_value + "*");
        });

        zero.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("0");
                return;
            }
            result_field.setText(current_value + "0");
        });

        dot.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText(".");
                return;
            }
            result_field.setText(current_value + ".");
        });

        percent.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("%");
                return;
            }
            result_field.setText(current_value + "%");
        });

        divide.addActionListener(ActionEvent -> {
            String current_value = result_field.getText();
            if (current_value.equals("Calculator is ready!")) {
                result_field.setText("");
                result_field.setText("/");
                return;
            }
            result_field.setText(current_value + "/");
        });

        equals.addActionListener(ActionEvent -> {
            System.out.println("Equals button pressed");

            String codeToBeEvaluated  = result_field.getText();

            try {
                Object result = engine.eval(codeToBeEvaluated);
                System.out.println(result);
                result_field.setText(result.toString());
            } catch (ScriptException e) {
                e.printStackTrace();
            }

        });

        clear.addActionListener(ActionEvent -> {
            result_field.setText("");
        });

    }
}
