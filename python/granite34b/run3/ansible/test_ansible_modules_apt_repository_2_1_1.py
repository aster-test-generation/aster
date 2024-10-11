import unittest
from unittest.mock import MagicMock
from ansible.modules.apt_repository import SourcesList


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        sources_list = SourcesList(module)
        self.assertEqual(sources_list.module, module)
        self.assertEqual(sources_list.files, {})
        self.assertEqual(sources_list.new_repos, set())
        self.assertEqual(sources_list.default_file, '/etc/apt/sources.list')

    def test_load(self):
        module = MagicMock()
        sources_list = SourcesList(module)
        file = '/etc/apt/sources.list'
        sources_list.load(file)
        self.assertEqual(sources_list.files[file], [])

    def test_save(self):
        module = MagicMock()
        sources_list = SourcesList()
        sources_list.save()
        self.assertEqual(sources_list.files, {})

    def test_dump(self):
        module = MagicMock()
        sources_list = SourcesList(module)
        dumpstruct = sources_list.dump()
        self.assertEqual(dumpstruct, {})

    def test_choice(self):
        module = MagicMock()
        sources_list = SourcesList()
        new = None
        old = 'old'
        result = sources_list._choice(new, old)
        self.assertEqual(result, 'old')

if __name__ == '__main__':
    unittest.main()