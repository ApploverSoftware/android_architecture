package pl.applover.androidarchitecture.util.extensions

/**
 * Created by Janusz Hain on 2018-01-08.
 */

/**
 * Example of use:
 *
 *  restaurant.meals!!.values.iterator().removeAll({ meal ->
 * meal.ownerId == User.current!!.id
 * || meal.acceptedUser != null
 * || meal.rejectedUsers.contains(User.current!!.id)
 * || meal.requestedUsers.containsKey(User.current!!.id)
 * })
 */
fun <T> MutableIterator<T>.removeAll(condition: (value: T) -> Boolean) {
    while (hasNext()) {
        val value = next()
        if (condition(value)) {
            remove()
        }
    }
}
