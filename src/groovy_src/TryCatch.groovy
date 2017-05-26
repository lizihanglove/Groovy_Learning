/**
 * 异常处理
 *
 * Created by lizihanglove on 2017/5/9.
 */

try {
    openFile("file")
} catch (ex) {//捕获之前的所有异常
    //do something
}


def openFile(String fileName) {
    new FileInputStream(fileName)//无需处理异常
}