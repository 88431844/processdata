#spark job 流程(Bate版):

1.编写读取hive工具类,可以参考钰航代码或者Google

2.从hive中读取想要的数据后,进行处理
a.将home_addr请求localservice
b.选取从localservice返回的地址列表中的地址,计算'平均'经纬度,作为家的经纬度
c.如果埋点的经纬度与从localservice返回并处理后的经纬度距离差距一定阈值之内(建议作为配置),则视为家地址,否则反之

3.将所有executor数据collect后,按照ishome', 'timestamp', 'latitude', 'longitude'写入csv中,
供Python机器学习代码作为数据集
