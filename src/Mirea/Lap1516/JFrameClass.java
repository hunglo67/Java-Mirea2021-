package Lap1516;

import Pr1516.InternetOrder;
import Pr1516.Order;
import Pr1516.OrderManager;
import Pr1516.RestaurantOrder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

public class JFrameClass extends JFrame {

    JFrameClass(OrderManager orderManager) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        setSize(700, 500);
        add(new MainPage(orderManager));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        show(true);
    }
}

class MainPage extends JPanel {
    MainPage(OrderManager orderManager) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new ButtonPanel(orderManager));
        add(new Orders(orderManager));
    }
}

class ButtonPanel extends JPanel {
    ButtonPanel(OrderManager orderManager) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBorder(BorderFactory.createEmptyBorder(10, 20, 30, 20));
        setAlignmentY(Component.CENTER_ALIGNMENT);

        JButton addInternet = new JButton("Создать интернет заказ");
        addInternet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateOrder createFrame = new CreateOrder("Internet", orderManager, new InternetOrder(),"");
            }
        });
        addInternet.setAlignmentY(Component.CENTER_ALIGNMENT);

        JButton addLocal = new JButton("Создать заказ в ресторане");
        addLocal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateOrder createFrame = new CreateOrder("Restaurant", orderManager, new RestaurantOrder(),"");

            }
        });
        addInternet.setAlignmentY(Component.CENTER_ALIGNMENT);

        add(addInternet);
        add(addLocal);

    }
}

class Orders extends JPanel {
    Orders(OrderManager orderManager) {
        setLayout(new GridLayout());
        add(new InternetOrders(orderManager));
        add(new LocalOrders(orderManager));

    }
}

class InternetOrders extends JPanel {
    InternetOrders(OrderManager orderManager) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel jl = new JLabel("Интернет заказы");
        jl.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(jl);
        JScrollPane scrollPane = new JScrollPane(new ListPanel(orderManager, "Internet"));
        add(scrollPane);
    }
}


class LocalOrders extends JPanel {
    LocalOrders(OrderManager orderManager) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel jl = new JLabel("Заказы в ресторане");
        jl.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(jl);
        JScrollPane scrollPane = new JScrollPane(new ListPanel(orderManager, "Restaurant"));

        add(scrollPane);
    }
}

class ListPanel extends JPanel {
    ListPanel(OrderManager orderManager, String type) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for (String e : orderManager.getAllOrders()) {
            if (type == ((Order) orderManager.getOrder(e)).getType()) {
                add(new OrderItem(e, orderManager.getOrder(e),orderManager));
            }
        }
        Thread update = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    removeAll();
                    for (String e : orderManager.getAllOrders()) {
                        if (type == ((Order) orderManager.getOrder(e)).getType()) {
                            add(new OrderItem(e, orderManager.getOrder(e),orderManager));
                        }
                    }
                    updateUI();
                }
            }
        });
        update.start();

    }
}

class OrderItem extends JLabel {
    OrderItem(String name, Order order, OrderManager orderManager) {
        setText(name);
        Font f = new Font("Calibri", Font.PLAIN, 15);
        setBorder(BorderFactory.createEmptyBorder(10, 20, -5, 20));
        setFont(f);
        setAlignmentX(Component.CENTER_ALIGNMENT);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CreateOrder createFrame = new CreateOrder("Internet", orderManager, order,name);
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