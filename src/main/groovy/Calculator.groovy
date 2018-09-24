class Calculator {
    private static Scanner scanner = new Scanner(System.in)
    private static int initInput() {
        println "BODMAS"
        println "Enter 1 for Division"
        println "Enter 2 for Multiplication"
        println "Enter 3 for Addition"
        println "Enter 4 for Subtraction"

        return getNextInt()
    }

    private static void calculation(int c) {
        int d = 1
        int m = 2
        int a = 3
        int s = 4
        def value1, value2

        println "Enter the first value:"
        value1 = getNextInt()
        println value1.class

        println "Enter the second value:"
        value2 = getNextInt()
        println value2.class

        switch (c) {
            case d:
                def Division = value1/value2
                println "$value1/$value2=$Division"

                break

            case m:
                def Multiplication = value1*value2
                println "$value1*$value2=$Multiplication"

                break

            case a:
                def Addition = value1+value2
                println "$value1+$value2=$Addition"

                break

            case s:
                def Subtraction = value1-value2
                println "$value1-$value2=$Subtraction"

                break

            default:
                println "The value you entered did not correspond to any of the options given."
        }
    }

    private static Boolean timezoneInput() {
        println "Are you interested in getting the current time of a country? [true/false]"

        scanner.nextBoolean()
    }

    private static void timezoneCalculation( Boolean response) {
        def y = true
        def n = false
        int country

        switch (response) {
            case y:
                def cam = 1
                def ger = 2
                def usPen = 3
                def fra = 4
                def chi = 5
                def timeDifference

                println "For Cameroon enter 1"
                println "For Germany enter 2"
                println "For Pennsylvania enter 3"
                println "For France enter 4"
                println "For China enter 5"

                country = getNextInt()

                Date date = new Date()

                switch (country) {
                    case cam:
                        System.out.println(date.toString())
                        break
                    case ger:
                        System.out.println(date.toString())
                        break
                    case usPen:
                        timeDifference = date.getTime() - 21600000
                        date.setTime(timeDifference)
                        System.out.println(date.toString())
                        break
                    case fra:
                        timeDifference = date.getTime() - 3600000
                        date.setTime(timeDifference)
                        System.out.println(date.toString())
                        break
                    case chi:
                        timeDifference = date.getTime() - 25200000
                        date.setTime(timeDifference)
                        System.out.println(date.toString())
                        break
                    default:
                        println "The value entered does not correspond to the options provided."
                }
                break
            case n:
                println "Then you have came to end of the program"
                break
            default:
                println "The value entered does not correspond to the option provided"
        }
    }
    static int getNextInt() {
        scanner.nextInt()
    }

    static void main(String[] args) {
        Integer c = initInput()
        calculation(c)
        Boolean response = timezoneInput()
        timezoneCalculation(response)
    }
}
