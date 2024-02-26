

import java.util.ArrayList;
import java.util.List;


public class Pipe {

        private final List<Filter> workers = new ArrayList<>();

        public void addWorker(Filter worker) {
            workers.add(worker);
        }

        public void produceChair(Chair chair) {
            for (Filter worker : workers) {
                worker.operate(chair);
            }
        }
}

