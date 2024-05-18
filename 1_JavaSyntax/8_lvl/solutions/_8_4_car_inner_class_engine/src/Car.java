public class Car {
    Engine engine = new Engine();
    class Engine {
        private boolean isRunning;
        Engine() {
            this.isRunning = false;
        }
        public void start() {
            this.isRunning = true;
        }
        public void stop() {
            this.isRunning = false;
        }
        public boolean checkIsRunning() {
            return this.isRunning;
        }
    }
}
