## SofaStack快速构建微服务

### Service代码

#### 发布服务
```
@Service
@SofaService(interfaceType = StockMngFacade.class, uniqueId = "${service.unique.id}", bindings = { @SofaServiceBinding(bindingType = "bolt") })
public class StockMngImpl implements StockMngFacade {
```

#### 调用服务
```
@SofaReference(interfaceType = StockMngFacade.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
private StockMngFacade stockMngFacade;

@SofaReference(interfaceType = BalanceMngFacade.class, uniqueId = "${service.unique.id}", binding = @SofaReferenceBinding(bindingType = "bolt"))
private BalanceMngFacade balanceMngFacade;
```

### system01-库存管理系统
```
http://localhost:8080/
```

### system02-Zipkin系统
```
http://localhost:9411/
```
z_01.png


### 参考文档
```
https://www.sofastack.tech/guides/sofastack-quick-start/
```
>"sofa_05"文档