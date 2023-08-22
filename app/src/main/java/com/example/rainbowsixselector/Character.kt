package com.example.rainbowsixselector

data class Character(
        val id: Int,
        val name: String,
        val role: Role
)

enum class Role {
    ATTACK, DEFENSE
}

object Characters {
    @JvmField
    val allCharacters = listOf(
            Character(1, "ace", Role.ATTACK),
            Character(2, "amaru", Role.ATTACK),
            Character(3, "ash", Role.ATTACK),
            Character(4, "kali", Role.ATTACK),
            Character(5, "lion", Role.ATTACK),
            Character(6, "mavrick", Role.ATTACK),
            Character(7, "montage", Role.ATTACK),
            Character(8, "nomad", Role.ATTACK),
            Character(9, "nokk", Role.ATTACK),
            Character(10, "buck", Role.ATTACK),
            Character(11, "brava", Role.ATTACK),
            Character(12, "blitz", Role.ATTACK),
            Character(13, "blackbeard", Role.ATTACK),
            Character(14, "capitao", Role.ATTACK),
            Character(15, "dokk", Role.ATTACK),
            Character(16, "osa", Role.ATTACK),
            Character(17, "flores", Role.ATTACK),
            Character(18, "finka", Role.ATTACK),
            Character(19, "fuze", Role.ATTACK),
            Character(20, "snes", Role.ATTACK),
            Character(21, "sledge", Role.ATTACK),
            Character(22, "thatcher", Role.ATTACK),
            Character(23, "thermite", Role.ATTACK),
            Character(24, "twitch", Role.ATTACK),
            Character(25, "grim", Role.ATTACK),
            Character(26, "gridlock", Role.ATTACK),
            Character(27, "glaz", Role.ATTACK),
            Character(28, "hibana", Role.ATTACK),
            Character(29, "iana", Role.ATTACK),
            Character(30, "iq", Role.ATTACK),
            Character(31, "zero", Role.ATTACK),
            Character(32, "zofia", Role.ATTACK),
            Character(33, "jackal", Role.ATTACK),
            Character(34, "ying", Role.ATTACK),
            Character(35, "fenrir", Role.DEFENSE),
            Character(36, "solis", Role.DEFENSE),
            Character(37, "azami", Role.DEFENSE),
            Character(38, "thorn", Role.DEFENSE),
            Character(39, "thunderbird", Role.DEFENSE),
            Character(40, "aruni", Role.DEFENSE),
            Character(41, "melussi", Role.DEFENSE),
            Character(42, "oryx", Role.DEFENSE),
            Character(43, "wamai", Role.DEFENSE),
            Character(44, "goyo", Role.DEFENSE),
            Character(45, "warden", Role.DEFENSE),
            Character(46, "mozzie", Role.DEFENSE),
            Character(47, "kaid", Role.DEFENSE),
            Character(48, "clash", Role.DEFENSE),
            Character(49, "alabi", Role.DEFENSE),
            Character(50, "maestro", Role.DEFENSE),
            Character(51, "vigil", Role.DEFENSE),
            Character(52, "ela", Role.DEFENSE),
            Character(53, "lesion", Role.DEFENSE),
            Character(54, "mira", Role.DEFENSE),
            Character(55, "yokai", Role.DEFENSE),
            Character(56, "cav", Role.DEFENSE),
            Character(57, "valk", Role.DEFENSE),
            Character(58, "frost", Role.DEFENSE),
            Character(59, "jaeger", Role.DEFENSE),
            Character(60, "thchanka", Role.DEFENSE),
            Character(61, "kapkan", Role.DEFENSE),
            Character(62, "rook", Role.DEFENSE),
            Character(63, "doc", Role.DEFENSE),
            Character(64, "pulse", Role.DEFENSE),
            Character(65, "castle", Role.DEFENSE),
            Character(66, "mute", Role.DEFENSE),
            Character(67, "smoke", Role.DEFENSE)
    )

}


