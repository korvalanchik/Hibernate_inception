package org.hibernate.dao.worker;

import org.hibernate.enitty.Worker;

import java.util.List;

public interface WorkerDao {

    boolean createWorker(Worker worker);

    boolean updateWorker(Worker worker);

    Worker getWorkerById(Long workerId);

    List<Worker> getAllWorkers();

    void deleteWorkerById(Long workerId);

    void deleteWorker(Worker worker);

    List<Worker> getWorkersWithMaxSalary();

    List<Worker> getOldestAndYoungestWorkers();
}
