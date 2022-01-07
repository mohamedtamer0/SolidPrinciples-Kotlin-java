package SolidPrinciplesKotlin.SingleResponsibilityOne.ExTwo

class UserProfile {
    /*
    1- show user posts
    2- report -> compliance
    3- block -> compliance
    4- send message
    5- show friends list
    6- unBlock -> compliance
     */

}

class ProfileRestrictionsManager {
    fun report(userProfile: UserProfile) {
        //....
    }

    fun block(userProfile: UserProfile) {
        //....
    }

    fun unBlock(userProfile: UserProfile) {
        //....
    }

}

class FriendsList {
    fun showFriendsOfUser(userProfile: UserProfile) {
        //....
    }
}

class UserPost {
    fun createPost(userProfile: UserProfile) {

    }
}


class Message {
    fun sendMessageToUser(userProfile: UserProfile) {

    }
}