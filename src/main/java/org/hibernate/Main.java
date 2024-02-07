package org.hibernate;

import org.hibernate.dao.clien.ClientDao;
import org.hibernate.dao.clien.ClientDaoImpl;

public class Main {
    public static void main (String[] args) {
//        List<Project> result = new ProjectDaoImpl().getLongestProjects();
//        result.forEach(p -> System.out.println(p.getName()));

//        Client client = new Client();
//        client.setName("222 Client");
//        Project project = new Project();
//        project.setName("222 project");
//        project.setStartDate(LocalDate.now());
//        project.setFinishDate(LocalDate.now().plusMonths(3));
//        project.setClient(client);
//        client.getProjects().add(project);
//
//        ClientDao dao = new ClientDaoImpl();
//        boolean result = dao.createClient(client);
//        System.out.println("result ===> " + result);

        ClientDao dao = new ClientDaoImpl();
        dao.deleteClientById(2L);
    }
}