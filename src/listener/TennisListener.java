package listener;
 
import javax.persistence.*;
import javax.servlet.*;
 
public class TennisListener implements ServletContextListener {
 
    // Prepare the EntityManagerFactory & Enhance:
    public void contextInitialized(ServletContextEvent e) {
        com.objectdb.Enhancer.enhance("tennis.*");
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("$objectdb/db/tennis.odb");
        e.getServletContext().setAttribute("emf", emf);
    }
 
    // Release the EntityManagerFactory:
    public void contextDestroyed(ServletContextEvent e) {
        EntityManagerFactory emf =
            (EntityManagerFactory)e.getServletContext().getAttribute("emf");
        emf.close();
    }
}