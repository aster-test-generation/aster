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

    def test_expand_path(self):
        module = MagicMock()
        sources_list = SourcesList(module)
        filename = 'test.list'
        result = sources_list._expand_path(filename)
        self.assertEqual(result, '/etc/apt/sources.list.d/test.list')

    def test_suggest_filename(self):
        module = MagicMock()
        sources_list = SourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        result = sources_list._suggest_filename(line)
        self.assertEqual(result, 'archive.canonical.com_ubuntu_hardy_partner.list')

    def test_parse(self):
        module = MagicMock()
        sources_list = SourcesList(module)
        line = 'deb http://archive.canonical.com/ubuntu hardy partner'
        result = sources_list._parse(line)
        self.assertEqual(result, (True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', ''))

    def test_iter(self):
        module = MagicMock()
        sources_list = SourcesList(module)
        sources_list.files = {
            'test.list': [
                (1, True, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Test repo'),
                (2, True, False, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Test repo'),
                (3, False, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Test repo'),
                (4, False, False, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Test repo'),
            ]
        }
        result = list(sources_list)
        self.assertEqual(result, [
            ('test.list', 1, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Test repo'),
            ('test.list', 3, True, 'deb http://archive.canonical.com/ubuntu hardy partner', 'Test repo'),
        ])

if __name__ == '__main__':
    unittest.main()