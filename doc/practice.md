#머스태치 장점
문법이 다른 템플릿 엔진 보다 심플
로직 코드를 사용할 수 없어 View에만 집중 가능
Mustache.js와 Mustache.java 2가지가 다있어서, 하나의 문법으로 클라이언트/서버 템플릿을 모두 사용가능

## 머스태치 문법
{{>layout/header}}
 - {{>}}는 현재 머스태치 파일(index.mustache)을 기준으로 다른 파일을 가져온다.

{{#posts}} {{/posts}}
 - {{#}} posts라는 Lists를 순회한다
 - Java의 for문과 동일하게 생각하며 ㄴ된다.

{{id}}
 - {{변수명}}
 - List에서 뽑아낸 객채의 필드 사용

# CSS는 header, JS는 Footer
페이지의 로딩속도를 높이기위해서는 css는 header에 js는 비교적 무겁기때문에 body로딩이 마무리된 후에 호출한다.
단. 반드시 앞에 위치해야하는 (bootstrap.js 등과 같은 js는 먼저 호출되도록 한다)


###Spring Boot는 기본적으로 src/main/resources/static에 위치한 js,CSS,Img등 정적 파일들을 URL에서 /로 설정된다.