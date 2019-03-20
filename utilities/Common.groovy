package utilities

class Common {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }
}