/**
 * Created by lizihanglove on 2017/5/26.
 */


//process()

private void process() {
    def process = "notepad".execute()

    println process.text
}

Thread.startDaemon {
    printThreadName()
    println "daemon thread finished"
}
Thread.start {
    println "normal thread start"
    printThreadName()
}


private printThreadName() {
    println "started the thread with name ${Thread.currentThread()}"
}
