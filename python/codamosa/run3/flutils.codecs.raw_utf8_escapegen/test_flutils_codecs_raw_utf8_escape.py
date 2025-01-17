# Automatically generated by Pynguin.
import flutils.codecs.raw_utf8_escape as module_0

def test_case_0():
    module_0.register()

def test_case_1():
    str_0 = 'H||TAU~2\\E\x0bD<'
    tuple_0 = module_0.encode(str_0)

def test_case_2():
    str_0 = "Change the mode of a path.\n\n    This function processes the given ``path`` with\n    :obj:`~flutils.normalize_path`.\n\n    If the given ``path`` does NOT exist, nothing will be done.\n\n    This function will **NOT** change the mode of:\n\n    - symlinks (symlink targets that are files or directories will be changed)\n    - sockets\n    - fifo\n    - block devices\n    - char devices\n\n    Args:\n        path (:obj:`str`, :obj:`bytes` or :obj:`Path <pathlib.Path>`):\n            The path of the file or directory to have it's mode changed.  This\n            value can be a :term:`glob pattern`.\n        mode_file (:obj:`int`, optional): The mode applied to the given\n            ``path`` that is a file or a symlink target that is a file.\n            Defaults to ``0o600``.\n        mode_dir (:obj:`int`, optional): The mode applied to the given\n            ``path`` that is a directory or a symlink target that is a\n            directory. Defaults to ``0o700``.\n        include_parent (:obj:`bool`, optional): A value of :obj:`True`` will\n            chmod the parent directory of the given ``path`` that contains a\n            a :term:`glob pattern`.  Defaults to :obj:`False`.\n\n    :rtype: :obj:`None`\n\n    Examples:\n        >>> from flutils.pathutils import chmod\n        >>> chmod('~/tmp/flutils.tests.osutils.txt', 0o660)\n\n        Supports a :term:`glob pattern`.  So to recursively change the mode\n        of a directory just do:\n\n        >>> chmod('~/tmp/**', mode_file=0o644, mode_dir=0o770)\n\n        To change the mode of a directory's immediate contents:\n\n        >>> chmod('~/tmp/*')\n\n    "
    tuple_0 = module_0.encode(str_0)
    str_1 = '|\\<\x0b'
    dict_0 = {}
    tuple_1 = module_0.decode(dict_0)
    str_2 = "#a \n?~c\n7xZ'\\X\\eRV"
    tuple_2 = module_0.encode(str_2, str_0)
    tuple_3 = module_0.encode(str_1)