# spring-issue-test
Spring boot 2 issue with parsing request

on sending a request:
```
<?xml version="1.0" encoding="UTF-8"?>
<TestRequest>
	<children>
		<child>
			<childStuffA>0</childStuffA>
			<childStuffB>0</childStuffB>
			<childStuffC>string</childStuffC>
		</child>
	</children>
	<doubleProperty>0</doubleProperty>
	<id>0</id>
	<longProperty>0</longProperty>
	<stringProperty>string</stringProperty>
</TestRequest>
```

The server throws an exception:
```
2020-01-28 18:47:03,198 DEBUG [http-nio-8069-exec-1] ServletInvocableHandlerMethod : Could not resolve parameter [0] in public org.springframework.http.ResponseEntity<org.test.dtos.TestResponse> org.test.controllers.TestController.testRoute(org.test.dtos.TestRequest): JSON parse error: Cannot construct instance of `org.test.dtos.TestChild` (although at least one Creator exists): no String-argument constructor/factory method to deserialize from String value ('0'); nested exception is com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot construct instance of `org.test.dtos.TestChild` (although at least one Creator exists): no String-argument constructor/factory method to deserialize from String value ('0')
 at [Source: (PushbackInputStream); line: 5, column: 18] (through reference chain: org.test.dtos.TestRequest["children"]->org.test.dtos.TestChildWrapper["child"]->java.util.HashSet[0])
2020-01-28 18:47:03,200 WARN  [http-nio-8069-exec-1] DefaultHandlerExceptionResolver : Resolved [org.springframework.http.converter.HttpMessageNotReadableException: JSON parse error: Cannot construct instance of `org.test.dtos.TestChild` (although at least one Creator exists): no String-argument constructor/factory method to deserialize from String value ('0'); nested exception is com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot construct instance of `org.test.dtos.TestChild` (although at least one Creator exists): no String-argument constructor/factory method to deserialize from String value ('0')
```
