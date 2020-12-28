FROM postgres:12
ARG LANGUAGE=ja_JP
RUN localedef -i $LANGUAGE -c -f UTF-8 -A /usr/share/locale/locale.alias $LANGUAGE.UTF-8
ENV LANG $LANGUAGE.utf8
EXPOSE 5432