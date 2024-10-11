import unittest
from ansible.modules.cron import CronModule


class TestCronModule(unittest.TestCase):
    def test_cron_module_init(self):
        cron_module = CronModule()
        self.assertIsInstance(cron_module, CronModule)

    def test_cron_module_get_cron_file_path(self):
        cron_module = CronModule()
        cron_file_path = cron_module.get_cron_file_path()
        self.assertIsInstance(cron_file_path, str)

    def test_cron_module_get_cron_file_header(self):
        cron_module = CronModule()
        cron_file_header = cron_module.get_cron_file_header()
        self.assertIsInstance(cron_file_header, str)

    def test_cron_module_get_cron_file_footer(self):
        cron_module = CronModule()
        cron_file_footer = cron_module.get_cron_file_footer()
        self.assertIsInstance(cron_file_footer, str)

    def test_cron_module_get_cron_file_env_vars(self):
        cron_module = CronModule()
        cron_file_env_vars = cron_module.get_cron_file_env_vars()
        self.assertIsInstance(cron_file_env_vars, str)

    def test_cron_module_get_cron_file_jobs(self):
        cron_module = CronModule()
        cron_file_jobs = cron_module.get_cron_file_jobs()
        self.assertIsInstance(cron_file_jobs, str)

    def test_cron_module_get_cron_file_content(self):
        cron_module = CronModule()
        cron_file_content = cron_module.get_cron_file_content()
        self.assertIsInstance(cron_file_content, str)

    def test_cron_module_get_cron_file_content_with_env_vars(self):
        cron_module = CronModule()
        cron_file_content_with_env_vars = cron_module.get_cron_file_content_with_env_vars()
        self.assertIsInstance(cron_file_content_with_env_vars, str)

    def test_cron_module_get_cron_file_content_with_jobs(self):
        cron_module = CronModule()
        cron_file_content_with_jobs = cron_module.get_cron_file_content_with_jobs()
        self.assertIsInstance(cron_file_content_with_jobs, str)

    def test_cron_module_get_cron_file_content_with_env_vars_and_jobs(self):
        cron_module = CronModule()
        cron_file_content_with_env_vars_and_jobs = cron_module.get_cron_file_content_with_env_vars_and_jobs()
        self.assertIsInstance(cron_file_content_with_env_vars_and_jobs, str)

    def test_cron_module_get_cron_file_content_with_env_vars_and_jobs_and_header_and_footer(self):
        cron_module = CronModule()
        cron_file_content_with_env_vars_and_jobs_and_header_and_footer = cron_module.get_cron_file_content_with_env_vars_and_jobs_and_header_and_footer()
        self.assertIsInstance(cron_file_content_with_env_vars_and_jobs_and_header_and_footer, str)

    def test_cron_module_get_cron_file_content_with_env_vars_and_jobs_and_header_and_footer_and_backup(self):
        cron_module = CronModule()
        cron_file_content_with_env_vars_and_jobs_and_header_and_footer_and_backup = cron_module.get_cron_file_content_with_env_vars_and_jobs_and_header_and_footer_and_backup()
        self.assertIsInstance(cron_file_content_with_env_vars_and_jobs_and_header_and_footer_and_backup, str)

if __name__ == '__main__':
    unittest.main()