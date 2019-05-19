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
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfMTcz/MDAxNTU4MjY0MTk0OTA3.k5mJE1K9zFDlun8-NjTL1pPOok4t82zJHPoLV8cCOd4g.mDuakPNEgFXUJvyE3-wmecv6Y2DUdMhedTc3imlfRfcg.PNG.jsh2583/%EC%9E%AC%EC%83%9D.png?type=w773"/>

> ● Jlayer의 Player Package와 Thread를 이용하여 재생 기능 구현 </br>
> ● File I/O를 이용하여 노래 파일를 불러오는 기능 구현 </br>
### ○ 정지 및 다시 재생
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfMjUg/MDAxNTU4MjY0MjI0MDkw.0VHYQPJMHoL6WlLHq6OKBrIoAc5U-WSlDC9x6dXJdpAg.Z_y9quWzgbapl3Smx2BoTRjZafjWL704Hiy4XN4Yassg.PNG.jsh2583/%EC%9E%AC%EC%83%9D%EC%A0%95%EC%A7%80.png?type=w773"/>
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfNjQg/MDAxNTU4MjY0MjQxMjc3.kg9g9fYQHMH6zCpmwmStJnXuA6w0z1L8Om2VBU_SZvog.KVG_Bzr9D6oDD3pbCOwhaGWzD9zaf5Q371DcjQcd6kkg.PNG.jsh2583/%EC%A0%95%EC%A7%80%EC%9E%AC%EC%83%9D.png?type=w773"/>

> ● File I/O를 이용하여 노래가 정지된 지점을 기억하고 그 부분부터 다시 재생하는 기능 구현</br>
### ○ 이전/다음 곡 재생
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfMTQy/MDAxNTU4MjY3NDUzMDI2.7JPAll6VDrwRRvKl-PeZP3vR5_fzN6HhS-uVUN6f7qYg.ML9lXI64qhmFxN7e5kRCgI2VK9SsyqlqRnNVnkR-8Zkg.PNG.jsh2583/%EB%8B%A4%EC%9D%8C%EC%9D%B4%EC%A0%84.png?type=w773"/>

> ● Java Swing AWT의 Table Component의 row값을 이용하여 구현</br>
> ● Math클래스의 random함수를 이용하여 Random기능 구현</br>
### ○ Progressbar
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfMTI5/MDAxNTU4MjY0Mjg0NzEw.cF2TEbFw_ZGc9kDReVSO0gAc4IX3UQCki64WBROsafUg.foWWn9lofjvnhCNFj3PnChwpCX_nLz6CbOgdbwWMC7cg.PNG.jsh2583/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%A0%88%EC%8A%A4%EB%B0%94-progressbarthread.png?type=w773"/>
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfMjQ1/MDAxNTU4MjY0MzA5MTI1.sDn_U8rnZ0IgrC6MSFBaFq6gSsXJlrJH5mNw6wq0dNcg.D7jMBWuNfvMQazgbkhZZQN-oUwLakcWOGtjDpXRgPqYg.PNG.jsh2583/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%A0%88%EC%8A%A4%EB%B0%94-songthread.png?type=w773"/>
<img src="https://postfiles.pstatic.net/MjAxOTA1MTlfNzMg/MDAxNTU4MjY0MzQ4ODY5.UpMoxfvaDMKdoMG7ES_u4YMl0TNgfKDtASJPv-tYdBYg.s-OBZnOq2Go2Y3iStHIzz_64tTo8o-2yXiI-n70Bqhgg.PNG.jsh2583/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%A0%88%EC%8A%A4%EB%B0%94-mouseclick.png?type=w773"/>

> ● Java Swing AWT의 Progressbar Component를 이용하여 시간의 흐름을 구현</br>
> ● MouseClickListener와 File I/O의 기능을 이용하여 MouseClick 지점을 계산하고 그 지점부터 재생하는 기능 구현</br>
> ● Thread를 이용하여 Progressbar의 진행 흐름을 구현</br>
> ● 
