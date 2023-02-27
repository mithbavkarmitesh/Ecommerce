
package com.mycompany.ecommerce.helper;
import com.mycompany.ecommerce.entities.Category;
import com.mycompany.ecommerce.entities.Product;
import com.mycompany.ecommerce.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryProvider {

    private static SessionFactory factory;

    public static SessionFactory getFactory() {
        try {

            if (factory == null) {
                factory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Category.class)
                        .addAnnotatedClass(User.class)
                        .addAnnotatedClass(Product.class)
                        .buildSessionFactory();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }
}


