package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        //XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        //Movie movie1 = xmlBeanFactory.getBean("moviedetails1",Movie.class);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Movie movie2 = applicationContext.getBean("movie",Movie.class);
        //autowire here using byName
        System.out.println(movie2);

        //autowire here using Constructor
        Movie movie3 = applicationContext.getBean("movie1",Movie.class);
        System.out.println(movie3);


  //      Movie movie1 = applicationContext.getBean("movie2",Movie.class);

        /*//for scope as prototype
        Movie movie3 = applicationContext.getBean("movie3",Movie.class);
        Movie movie4 = applicationContext.getBean("movie4",Movie.class);

        //for bean name
        Movie movie5 = applicationContext.getBean("MovieA",Movie.class);
        Movie movie6 = applicationContext.getBean("MovieB",Movie.class);
*/
        //BeanDefinitionRegistry beanDefinitionRegistry = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        //XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        //Movie movie3 = ((XmlBeanFactory)xmlBeanFactory).getBean("moviedetails2",Movie.class);

        //System.out.println(movie1.toString());
        //System.out.println(movie2.toString());  //print the same thing twice
        //System.out.println(movie3.toString());  //print the same thing twice

      /*  System.out.println(movie2.toString());
        System.out.println(movie1 == movie2);

        //for scope prototype
        System.out.println(movie3.toString());
        System.out.println(movie3 == movie4);

        //get bean by name, not id
        System.out.println(movie5.toString());
        System.out.println(movie5 == movie6);*/


    }
}
