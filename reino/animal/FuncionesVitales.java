package reino.animal;

public interface FuncionesVitales {
    /**
     *  Los animales, por ejemplo, nacen de huevos (ovíparos), otros directamente de la madre (vivíparos) y otros
     *  directamente de la madre pero en su interior, el embrión se desarrolla dentro de un huevo (ovovivíparos).
     *  Los Vegetales o plantas pueden nacer por esporas o por semillas y por ejemplo los hongos siempre a partir de esporas.
     *  Algunos seres vivos unicelulares se reproducen por bipartición (se parte la célula).
     */
    void nacer();

    /**
     * odos los seres vivos crecen hasta que llegan a su estado de adultos. Para crecer transforma el alimento en
     * materia propia. Esta propiedad también les permite reparar heridas y renovar partes envejecidas que mueren..
     */
    void crecer();

    /**
     * verifica si el animal llego a su estado adulto
     * @return boolean
     */
    boolean isAdulto();

    /**
     *  Necesitan alimentarse para obtener la materia y la energía que necesitan para vivir. Estos alimentos los
     *  obtienen del medio que les rodea. Esta función también se puede llamar Nutrición. Mediante la nutrición los
     *  seres vivos absorben los alimentos y los líquidos que necesitan para poder realizar las funciones vitales.
     *  Tenemos dos tipos de alimentación: Autótrofos: Aquellos seres vivos que son capaces de elaborar su propio alimento,
     *  por ejemplo las plantas y Heterótrofo: Aquellos que no son capaces de elaborar su propio alimento y dependen de
     *  otros organismos para la nutrición, por ejemplo los hongos, los animales, etc.
     */
    void alimentarse();

    /**
     * La respiración es el proceso que consiste en obtener el oxígeno para el cuerpo y la expulsión de dióxido de carbono.
     * Los peces tienen respiración branquial, por donde absorben el oxigeno del agua, las plantas respiran a través de
     * su superficie (hojas), los seres humanos y los anfibios respiramos por medio de los pulmones y los insectos por las tráqueas.
     */
    void respirar();

    /**
     * Para no confundirnos, esta propiedad hace referencia a que los seres vivos se adaptan al medio en el que viven.
     * Todos los seres vivos respondemos a los estímulos externos, aunque de diferentes maneras. Por ejemplo, si hace
     * frio nos abrigamos. Conclusión los seres vivos recibimos información del medio que nos rodea y respondemos a esa
     * información de la manera más adecuada para sobrevivir.
     */
    void adaptarse();

    /**
     * Hay varias formas diferentes de reproducción. La forma más conocida es la reproducción sexual, en la que las
     * células sexuales de un individuo de sexo masculino se unen a las de un individuo de sexo femenino. A veces un
     * mismo individuo puede ser macho y hembra, en tal caso hablamos de hermafroditas (muchos vegetales lo son). El
     * otro tipo de reproducción es la Asexual, en la que a partir de una porción de individuo se puede desarrollar otro
     * individuo completo, idéntico a él (ejemplo los esquejes de plantas).
     */
    void reproducirse();
}
