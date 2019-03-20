package utilities
import utilities.Common

class dummy {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }
}