package Lap1516;

import Pr1516.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;

//import static groovy.console.ui.text.FindReplaceUtility.dispose;

public class CreateOrder extends JFrame {
    CreateOrder(String type,OrderManager orderManager, Order setOrder, String name) {
        setResizable(false);
        setSize(500, 700);
        InternetOrder newInternetOrder = new InternetOrder();
        RestaurantOrder newRestaurantOrder = new RestaurantOrder();
        Order currentOrder;
        currentOrder=setOrder;

        add(new List(currentOrder,orderManager, this,name));
        show();
    }
}

class List extends JPanel {
    List(Order currentOrder, OrderManager orderManager, JFrame parent, String name) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel info = new JLabel("Продукты в заказе");
        info.setAlignmentX(Component.CENTER_ALIGNMENT);
        info.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(info);
        setBorder(BorderFactory.createEmptyBorder(15, 100, 25, 100));
        JScrollPane scrollPane = new JScrollPane(new allProducts(currentOrder));
        add(scrollPane);
        add(new OrderButtons(currentOrder, orderManager,parent, name), BorderLayout.NORTH);
    }
}

class allProducts extends JPanel {
    allProducts(Order currentOrder) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Thread update = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    removeAll();
                    for (orderItem e : currentOrder.getOrders()) {
                        add(new OrderItemProduct(((Item) e.getObj()),currentOrder));
                    }
                    updateUI();
                }
            }
        });
        update.start();
    }
}

class OrderItemProduct extends JLabel {
    OrderItemProduct(Item item, Order currentOrder) {
        setText(item.getName());
        Font f = new Font("Calibri", Font.PLAIN, 15);
        setBorder(BorderFactory.createEmptyBorder(10, 20, -5, 20));
        setFont(f);
        setAlignmentX(Component.CENTER_ALIGNMENT);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int dialogResult = JOptionPane.showConfirmDialog (null, "Цена: "+item.getPrice()+"\nОписание: "+item.getDesc(),"Вы действительно хотите удалить "+item.getName()+"?",JOptionPane.YES_NO_OPTION);
                if(dialogResult==JOptionPane.YES_OPTION){
                    currentOrder.remove(item.getName());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}

class OrderButtons extends JPanel {
    String address="";

    OrderButtons(Order currentOrder, OrderManager orderManager,JFrame parent, String name) {
        JPanel jo = new JPanel();
        address=name;
        JLabel jl = new JLabel("Адрес: "+address);
        jo.add(jl, BorderLayout.NORTH);
        add(jo);


        setLayout(new FlowLayout());
        setAlignmentY(Component.BOTTOM_ALIGNMENT);
        JButton setAddress = new JButton("Установить адрес");
        setAddress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                address=JOptionPane.showInputDialog(frame, "Введите адрес");
                jl.setText("Адрес: "+address);
            }
        });
        add(setAddress);

        JButton addDish = new JButton("Добавить блюдо");
        addDish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread th = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        new CreateOrderItem(currentOrder, "Dish");
                    }
                });
                th.start();
            }
        });
        add(addDish);

        JButton addDrink = new JButton("Добавить напиток");
        addDrink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread th = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        new CreateOrderItem(currentOrder, "Drink");
                    }
                });
                th.start();
            }
        });
        add(addDrink);

        JButton save = new JButton("Сохранить");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderManager.removeOrder(name);
                try {
                    orderManager.add(address, currentOrder);
                } catch (OrderAlreadyAddedException ex) {
                    ex.printStackTrace();
                } catch (IllegalTableNumber ex) {
                    ex.printStackTrace();
                }
                parent.setVisible(false);
                parent.dispose();
            }
        });
        add(save);
    }
}


class CreateOrderItem extends JFrame {
    CreateOrderItem(Order currentOrder, String type) {
        setSize(300, 300);
        setResizable(false);
        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BoxLayout(parentPanel, BoxLayout.Y_AXIS));
        parentPanel.add(new InputPanel("Название"));



        String[] items = {
                "BEER",
                "WINE",
                "VODKA",
                "BRANDY",
                "CHAMPACNE",
                "WHISKEY",
                "TEQUILA",
                "RUM",
                "VERMUTH",
                "LIQUOR",
                "JAGERMEISTER",
                "сок",
        };
        JComboBox comboBox = new JComboBox(items);
        comboBox.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        if(type=="Drink"){

            parentPanel.add(comboBox);
        }


        parentPanel.add(new InputPanel("Описание"));
        parentPanel.add(new InputPanel("Цена"));

        JPanel buttonPanel = new JPanel();
        JButton save = new JButton("Сохранить");
        buttonPanel.add(save);

        parentPanel.add(buttonPanel);
        add(parentPanel);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = ((InputPanel) parentPanel.getComponent(0)).getText();
                String desc;
                String price;


                if(type=="Drink"){
                    desc=((InputPanel) parentPanel.getComponent(2)).getText();
                    price=((InputPanel) parentPanel.getComponent(3)).getText();
                    if(items[comboBox.getSelectedIndex()].equals("сок")){

                    }else{
                        int dialogResult = JOptionPane.showConfirmDialog (null, "Вам есть 18 лет?","Упс...........",JOptionPane.YES_NO_OPTION);
                        if(dialogResult==JOptionPane.YES_OPTION){

                        }else{
                            setVisible(false);
                            dispose();
                            return;
                        }
                    }
                }else{
                    desc = ((InputPanel) parentPanel.getComponent(1)).getText();
                    price = ((InputPanel) parentPanel.getComponent(2)).getText();
                }


                if (type == "Dish") {
                    currentOrder.add(new orderItem(new Dish(Integer.parseInt(price), name, desc)));

                } else {
                    currentOrder.add(new orderItem(new Drink(Integer.parseInt(price), name, desc)));
                }
                setVisible(false);
                dispose();
            }
        });

        show();
    }
}

class InputPanel extends JPanel {
    JTextField jt = new JTextField();

    InputPanel(String title) {
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel jl = new JLabel(title);
        jl.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
        add(jl);

        jt.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(jt);
    }

    String getText() {
        return jt.getText();
    }
}