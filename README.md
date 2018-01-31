Проект по дициплине ИС

IDE - Netbeans 8.1

Git

Конфигурирование адреса электронной почты и имени пользователя:

	git config --global user.email "you@example.com"
	git config --global user.name "Your Name"

Инициализация нового репозитория:

	git init .

Добавление всех новых файлов проекта в индекс репозитория:

	git add .

Коммит в репозиторий с добавлением комментария:

	git commit -m ‘test commit’

можно добавить флаг -a , который говорит о необходимости фиксации изменений  в уже существующих файлах (это также относится к переименованным файлам)

Создание новой ветки и переключение на её использование:

	git checkout -b “new_branch”

Добавление нового удалённого репозитория:

	git remote add origin git@git@github.com:VarnavaRom/VideoArchive.git

Показать и удаленно отслеживаемые, и локальные ветки:

	git branch -a

Вывести имена веток:

	git branch --list

Удалить ветку branch-name

	git branch -d [branch-name]

флаг -D, вместо -d удалит ветку даже если изменения не были объединены с мастер-веткой

Переключится на ветку master и смержить в неё изменения ветки new_branch

	git checkout master 
	git merge “new_branch”

Клонировать удаленный репозиторий:	

	git clone [addresss]

Добавить удалённый репозиторий:

	git remote add [projectName]

Забрать изменения удаленной ветки из репозитория по умолчанию, основной ветки; той, которая была использована при клонировании репозитория:

	git fetch [projectName]

Cразу забирает изменения и проводит слияние с активной веткой:

	git pull

Отправить свои изменения в удаленную ветку, созданную при клонировании по умолчанию:

	git push

Отправить в удаленную ветку master репозитория origin (синоним репозитория по умолчанию) ветки локальной ветки master:

	git push origin master:master

Из индекса и дерева проекта одновременно можно удалить отдельные файлы:

	git rm FILE1 FILE2

Сбросить весь индекс:

	git reset

Удалить из индекса конкретный файл:

	git reset -EDITEDFILE

Мягко сбросить последний коммит:

	git reset --soft HEAD^ 
	
Жестко сбросить последний коммит:

	git reset --hard HEAD~1

Отмена изменений, произведенных в прошлом отдельным коммитом:

	git revert

Проверить состояние состояние проекта, измененные и не добавленные файлы, индексированные файлы:

	git status

Информация о коммитах в целом:

	git log

Просмотреть информацию о коммитах по файлу README: 

	git log README

Отличия между деревьями проекта, коммитами и т.д.

	git diff

Изменения в проекте по сравнению с последним коммитом:

	git diff HEAD

Показать изменения, внесенные отдельным коммитом:

	git show

Показать информацию по изменениям файла README:

	git blame README

Поиск слова tst по проекту, состоянию проекта в прошлом:

	git grep tst

