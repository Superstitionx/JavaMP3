# JavaMP3
## ○ 사용한 기술
> ● Connection Manager를 구현하여 Database 연동</br>
> ● Oracle을 사용하여 Database 구현 및 설계 </br>
> ● Java Swing AWT를 사용하여 Component 구현 </br>
> ● Jlayer 라이브러리와 Thread를 이용하여 노래 재생기능 구현 </br>
> ● JAudiotagger 라이브러리를 이용하여 노래의 Tag값을 추출하여 노래의 정보 표시 구현 </br>

## ○ ERD
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfNzMg/MDAxNTU4MjY0MzY0NDYz.RaHQDTBDd2OqhLFzQ4VOpBUJOo7aRBHNcD6JWBTdkGcg.HXWO7T3QPGJRzOheos-E_ll7cI1LRfU7zvN6qoQFbh4g.PNG.jsh2583/erd.png?type=w773"/>

## ○ Class Diagram
### ○ 회원관리 Class Diagram
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfOTQg/MDAxNTU4MjY0NDE1MDQ2.6TUaoWMQ5015POPEut91PRW-LTq6SxaUKpZohkMnF2og.VFvH8X1XjHmaD09X6njQfE1hpQ1gjtlWHTB5D16DoNQg.PNG.jsh2583/%EB%A1%9C%EA%B7%B8%EC%9D%B8_%ED%81%B4%EB%9E%98%EC%8A%A4%EB%8B%A4%EC%9D%B4%EC%96%B4%EA%B7%B8%EB%9E%A8.png?type=w773"/>

### ○ 플레이어 Class Diagram
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfMTMz/MDAxNTU4MjY0NDM1MTE5.qJKq0BEsyYQkKjx5K2jn1bRrBHyYefBfRA7cT3QlACog.iozxY9GzhHavwyiMB6q7VxQr-9_QTFDZofxTQLSGaMYg.PNG.jsh2583/Player_%ED%81%B4%EB%9E%98%EC%8A%A4%EB%8B%A4%EC%9D%B4%EC%96%B4%EA%B7%B8%EB%9E%A8.png?type=w773"/>

### ○ 게시판 Class Diagram
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfNzEg/MDAxNTU4MjY0NDU1NjY1.JhIVzd8MO1wOWS6k0GCIrcBxVcbyBOX4lVnusOiIgMkg.lP2uZyo9Ud2hT9sQRnukrWfb2hIfAGdTxBLHy5VMQ4wg.PNG.jsh2583/%EA%B2%8C%EC%8B%9C%ED%8C%90_%ED%81%B4%EB%9E%98%EC%8A%A4%EB%8B%A4%EC%9D%B4%EC%96%B4%EA%B7%B8%EB%9E%A8.png?type=w773"/>

## ○ 회원관리 기능
### ○ 로그인
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfNDEg/MDAxNTU4MjY0MDY3MTU5.9zcupC_VqNLpN-Wjthpu3Rfaxfuji_R4aFxrJKKhk9Qg.eu5UkCTfn4hS2LRfU5XX_F5Sm8BB66Nv0O_tqyGt__wg.PNG.jsh2583/%EB%A1%9C%EA%B7%B8%EC%9D%B8.png?type=w773"/>

> ● Select문을 이용하여 로그인 기능 구현 </br>
### ○ 회원가입
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfMjM0/MDAxNTU4MjY0MDk1NDI3.-x_1zZMHy51c6YTxawBCQVttQL7xuppwqWVQXT8Cp80g.DgB2OqTCvix3fbZ3q97wuFesHEUx-R3nnQQ8kdZKtMsg.PNG.jsh2583/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85.png?type=w773"/>

> ● Insert문을 이용하여 회원가입 기능 구현 </br>
### ○ 아이디/비밀번호 찾기
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfMjcg/MDAxNTU4MjY0MTY4MzMw.9BUkd7PQibvVAmFA4qdfsFoe9fBzfOnU0F_KxG2JVwEg.FYyR2gC-Zn0vQHj7LrRtnYmcPVpxSwT4fXQ3dEYNJpEg.PNG.jsh2583/%EC%B0%BE%EA%B8%B0.png?type=w773"/>

> ● Select문을 이용하여 아이디 및 비밀번호 찾기 기능 구현 </br>
## ○ 플레이어 기능
### ○ 재생
### ○ 정지 및 다시 재생
### ○ Progressbar
