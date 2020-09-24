class VirusFactory {


    fun makeVirus(type: VirusType): Virus {
        return when (type) {
            VirusType.CORONA -> CoronaVirus()
            VirusType.INFLUENZA -> InfluenzaVirus()
            else -> HIVVirus()
        };
    }

}

enum class VirusType{
    CORONA,
    INFLUENZA,
    HIV
}