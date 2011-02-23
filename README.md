LESS Engine w/ Ant Task
=======================

This fork of http://github.com/asual/lesscss-engine extends it with an ant task to make it easy
to place it in ant buildfiles.

This is how you can integrate less in your buildfile:
<target name="build.css">
	<taskdef name="lesscss" classname="com.asual.lesscss.LessEngineTask" classpathref="build.aux" />
	<property name="css.dir" value="[your_css_dir]" />
	<lesscss input="${css.dir}/[less1]" output="${css.dir}/[css1]" />
	<lesscss input="${css.dir}/[less2]" output="${css.dir}/[css2]" />
</target>

You can download the enhanced lesscss-engine jar directly from the downloads section of this repo.
