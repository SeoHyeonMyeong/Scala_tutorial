package tutor

object N00_Setting:
    def test() = 
        println("""
        1. Coursier를 설치
        
        2. scala와 scalac를 설치
            $ cs launch scala
            $ cs launch scalac
        
        3. 새로운 스칼라 프로젝트를 생성
            $ sbt new scala/scala3.g8
        
        4. 스칼라 프로젝트 실행
            $ sbt
            sbt:[PROJECT]> run
        
        5. 스칼라 프로젝트 구조
            - hello-world
                - project (sbt 에서 사용하는 프로젝트 폴더)
                    - build.properties
                - build.sbt (sbt 빌드 정의용 파일)
                - src
                    - main
                        - scala (모든 스칼라 코드는 여기에 적습니다.)
                            - Main.scala (프로그램의 시작 포인트) <-- 현재 제일 중요한 파일
        """)