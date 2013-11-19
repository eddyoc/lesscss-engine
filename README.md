LESS Engine w/ Ant Task
=======================

This fork of cimi's lesscss Ant task is essentially a merge of the latest snapshot of asual's lesscss-engine.

This is to incorporate the fix to the StreamResourceLoader.Pattern such that Windows paths are matched succesfully. See
https://github.com/asual/lesscss-engine/issues/33

Or in plain English - this version works on Windows, especially useful in those dastardly corporate environments where that
legacy Microsoft desktop OS still reigns.

The following is the forked readme as is...

This fork of [asual's lesscss engine](http://github.com/asual/lesscss-engine) extends it with an ant task to make it easy
to place it in ant buildfiles.

This is how you can integrate less in your buildfile:
    <target name="build.css">
        <taskdef name="lesscss" classname="com.asual.lesscss.LessEngineTask" classpathref="build.aux" />
        <property name="css.dir" value="[your_css_dir]" />
        <lesscss input="${css.dir}/[less1]" output="${css.dir}/[css1]" />
        <lesscss input="${css.dir}/[less2]" output="${css.dir}/[css2]" />
    </target>

If you don't have/want to use Maven to build the sources, you can download the enhanced lesscss-engine jar directly from the downloads section of this repo.

To run the task, the basic dependencies are:
* Rhino (js-1.6R7.jar)  
* Apache Commons Logging

TODOs:  
* add compressor capability to the task  
* write tests to integrate the new capability
