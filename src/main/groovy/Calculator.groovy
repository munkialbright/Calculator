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
                def wat = 1
                def act = 2
                def jst = 3
                def cet = 4
                def pst = 5
                def gmt = 6

                println "For West African Time enter 1"
                println "For Australian Central Time enter 2"
                println "For Japan Standard Time enter 3"
                println "For Central European Time enter 4"
                println "For Pacific Time  enter 5"
                println "For Greenwich Meridian Time enter 6"

                country = getNextInt()

                switch (country) {
                    case wat:
                        Date date = new Date()
                        System.out.println(date.toString())
                        break
                    case act:
                        TimeZone.setDefault(TimeZone.getTimeZone('ACT'))
                        println new Date()
                        break
                    case jst:
                        TimeZone.setDefault(TimeZone.getTimeZone('JST'))
                        println new Date()
                        break
                    case cet:
                        TimeZone.setDefault(TimeZone.getTimeZone('CET'))
                        println new Date()
                        break
                    case pst:
                        TimeZone.setDefault(TimeZone.getTimeZone('PST'))
                        println new Date()
                        break
                    case gmt:
                        TimeZone.setDefault(TimeZone.getTimeZone('GMT'))
                        println new Date()
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
